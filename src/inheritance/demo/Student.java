package inheritance.demo;

public class Student extends Person {

    private String schoolName;

    public Student(String name, String address, String schoolName) {
        super(name, address);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }



    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
