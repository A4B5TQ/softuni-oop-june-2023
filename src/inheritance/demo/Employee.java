package inheritance.demo;

public class Employee extends Person {
    private String companyName;

    public Employee(String name, String address, String companyName) {
        super(name, address);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void printOnConsole() {
        String print = String.format("%s -> %s -> %s", super.getName(), super.getAddress(), this.getCompanyName());
        System.out.println(print);
    }

}
