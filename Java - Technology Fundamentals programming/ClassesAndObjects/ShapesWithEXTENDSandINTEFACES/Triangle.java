package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }


    @Override
    public double calculatePerimeter() {
        return this.getA() + this.getB() + this.getC();
    }

    @Override
    public double calculateArea() {
        return this.getA() * this.getH() / 2;
    }
}
