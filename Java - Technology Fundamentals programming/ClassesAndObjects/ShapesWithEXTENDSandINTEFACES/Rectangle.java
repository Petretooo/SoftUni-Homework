package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * this.getA() + 2 * this.getB();
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
