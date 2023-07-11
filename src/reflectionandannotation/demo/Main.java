package reflectionandannotation.demo;

import polymorphism.shapes.Circle;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SimpleObjectMapper simpleObjectMapper = new SimpleObjectMapper();

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("name", "Test");
        dataMap.put("num", 123);
        dataMap.put("Data", "MyData");
        dataMap.put("createdOn", LocalDateTime.now());

        MyObject myObject = simpleObjectMapper.convertToValue(dataMap, MyObject.class);

        Map<String,Object> personDataMap = new HashMap<>();
        personDataMap.put("name", "DemoPerson");
        personDataMap.put("age", 30);

        DemoPerson demoPerson = simpleObjectMapper.convertToValue(personDataMap, DemoPerson.class);
        System.out.println();

        Map<String,Object> circleData = new HashMap<>();
        circleData.put("radius", 125.0);

        Circle circle = simpleObjectMapper.convertToValue(circleData, Circle.class);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(simpleObjectMapper.writeValueAsString(circle));
        System.out.println(simpleObjectMapper.writeValueAsString(demoPerson));
        System.out.println(simpleObjectMapper.writeValueAsString(myObject));
    }
}
