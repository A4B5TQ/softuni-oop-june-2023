package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.childDepartments.add(department);
    }


    public void removeDepartment(Department department) {
        this.childDepartments.remove(department);
    }

    @Override
    public void printName() {
        this.childDepartments.forEach(Department::printName);
    }
}
