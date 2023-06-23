package workingWithAbstraction.enumerations;

public enum Day {
    MONDAY(1,"Monday"),TUE(2,"fr");

    private int order;
    private String name ;

    Day(int order,String name) {
        this.order = order;
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }
}
