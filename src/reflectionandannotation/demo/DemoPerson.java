package reflectionandannotation.demo;

public class DemoPerson {

    private int age;
    private String name;

    public DemoPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public DemoPerson() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
