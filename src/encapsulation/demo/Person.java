package encapsulation.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person extends Human {

    private final static String DEFAULT_NAME_VALUE = "Gosho";
    private final static Integer DEFAULT_AGE_VALUE = 0;

    int age;

    private final List<String> innerData;

    public Person() {
        this(DEFAULT_AGE_VALUE, DEFAULT_NAME_VALUE);

    }

    public Person(int age, String name) {
        this.setName(name);
        this.setAge(age);
        this.innerData = new ArrayList<>();
    }

    public List<String> getInnerData() {
        return Collections.unmodifiableList(this.innerData);
    }

//    public void setInnerData(List<String> innerData) {
//        this.innerData = innerData;
//    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Sorry");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void validate(int param) {
        if (param < 0) {
            throw new IllegalArgumentException("Sorry");
        }
    }
}
