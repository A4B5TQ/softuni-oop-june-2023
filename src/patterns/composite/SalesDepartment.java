package patterns.composite;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
