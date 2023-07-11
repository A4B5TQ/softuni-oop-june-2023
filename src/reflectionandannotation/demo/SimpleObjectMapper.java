package reflectionandannotation.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class SimpleObjectMapper {

    public <T> T convertToValue(Map<String, Object> dataSource,
                                Class<T> returnType) {
        T instance = this.getInstance(returnType);
        Field[] declaredFields = returnType.getDeclaredFields();
        for (Field declaredField : declaredFields) {

            Object value = dataSource.get(declaredField.getName());

            if (value == null && declaredField.isAnnotationPresent(FieldMapping.class)) {
                FieldMapping annotation = declaredField.getAnnotation(FieldMapping.class);
                String key = annotation.name();
                value = dataSource.get(key);
            }
            this.setFieldValue(declaredField, instance, value);

        }

        return instance;
    }

    public String writeValueAsString(Object val) {
        Field[] declaredFields = val.getClass().getDeclaredFields();
        String pattern = "%s -> %s";
        StringBuilder res = new StringBuilder();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = null;
            try {
                value = declaredField.get(val);
            } catch (IllegalAccessException ignored) {

            }
            res.append(String.format(pattern, declaredField.getName(), String.valueOf(value)));
            res.append(System.lineSeparator());
        }

        return res.toString();
    }

    private <T> T getInstance(Class<T> returnType) {
        try {
            Constructor<T> constructor = returnType.getConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException |
                 InvocationTargetException |
                 InstantiationException |
                 IllegalAccessException e) {
            throw new IllegalArgumentException("Missing default empty constructor");
        }

    }

    private void setFieldValue(Field field, Object instance, Object value) {
        try {
            field.setAccessible(true);
            field.set(instance, value);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
