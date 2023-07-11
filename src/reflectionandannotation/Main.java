package reflectionandannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Reflection> reflectionClass = Reflection.class;


//        System.out.println(reflectionClass.getName());
//        System.out.println(reflectionClass.getName());
//        System.out.println(reflectionClass.getCanonicalName());
//        Class reflectionClazz = Class.forName(reflectionClass.getName());

//        System.out.println(reflectionClass);

        // Class type
        System.out.println(reflectionClass);

        // Superclass Type
        System.out.println(reflectionClass.getSuperclass());

        // All Interfaces
        Arrays.stream(reflectionClass.getInterfaces()).
                forEach(System.out::println);

        // Create an instance
        Constructor<Reflection> constructor = reflectionClass.getConstructor();
        Reflection reflection = constructor.newInstance();
        System.out.println(reflection.email);

        Constructor<?>[] declaredConstructors = reflectionClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            Arrays.stream(declaredConstructor.getParameterTypes())
                    .forEach(System.out::println);
        }
        Constructor<Reflection> declaredConstructor = reflectionClass.getDeclaredConstructor(String.class, String.class, String.class, int.class);
        Reflection test = declaredConstructor.newInstance("Test", "https://test.test.com", "test@test.com", 8848);

//        Arrays.stream(test.getClass().getFields())
//                        .forEach(f -> System.out.printf("%s -> %s%n",f.getName(),f.getType()));
        Field zip = reflectionClass.getDeclaredField("zip");
        zip.setAccessible(true);
        System.out.println("Test -> " + zip.get(test));

        System.out.println("Reflection -> " + zip.get(reflection));
        zip.set(test, 8848);
        System.out.println("Test -> " + zip.get(test));
        System.out.println("Test -> " + zip.get(reflection));


        Method[] declaredMethods = reflectionClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).sorted(Comparator.comparing(Method::getName))
                .forEach(m -> {
                    if (m.getName().startsWith("get")) {
                        System.out.println(String.format("%s will return class %s", m.getName(), m.getReturnType().getTypeName()));
                    } else if (m.getName().startsWith("set") &&
                            m.getParameterTypes().length == 1) {
                        System.out.println(String.format("%s and will set field of class %s", m.getName(),
                                m.getParameterTypes()[0].getTypeName()));
                    }
                });


        Arrays.stream(reflectionClass.getDeclaredFields()).sorted(Comparator.comparing(Field::getName))
                .forEach(f -> {

                    if (f.isAnnotationPresent(MyAnnotation.class)) {
                        MyAnnotation annotation = f.getAnnotation(MyAnnotation.class);
                        System.out.println(annotation.value());
                        System.out.println();
                    }

                    boolean isPrivate = Modifier.isPrivate(f.getModifiers());
                    if (!isPrivate) {
                        System.out.printf("%s must be private!%n",f.getName());
                    }
                });
        Arrays.stream(declaredMethods).sorted(Comparator.comparing(Method::getName))
                .forEach(m -> {
                    if (m.getName().startsWith("get") && !Modifier.isPublic(m.getModifiers())) {
                        System.out.printf("%s have to be public!%n", m.getName());
                    } else if (m.getName().startsWith("set") &&
                            m.getParameterTypes().length == 1 &&
                            !Modifier.isPrivate(m.getModifiers())) {
                        System.out.printf("%s have to be private!%n", m.getName(),
                                m.getParameterTypes()[0].getTypeName());
                    }
                });

//        for (Method declaredMethod : declaredMethods) {
//            int modifiers = declaredMethod.getModifiers();
//            System.out.println(Modifier.toString(modifiers));
//        }

        Annotation[] annotations = reflectionClass.getAnnotations();
        Arrays.stream(annotations).forEach(a -> {
            if (a instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) a;
                System.out.println(myAnnotation.value());
            }
        });
        Annotation[] zips = reflectionClass.getDeclaredField("zip").getAnnotations();
        Arrays.stream(zips).forEach(a -> {
            if (a instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) a;
                System.out.println(myAnnotation.value());
            }
        });
        System.out.println();

    }
}
