package polymorphism.shapes;
public abstract class Shape {

    private double perimeter;
    private double area;

    public abstract void calculatePerimeter();
    public abstract void calculateArea();

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }
}
