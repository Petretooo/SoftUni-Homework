package ClassesAndObjects.ShapesWithEXTENDSandINTEFACES;

public class Hexagon implements Shape {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }


    @Override
    public double calculatePerimeter() {
        return 6 * this.getA();
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3)) / (2 * Math.pow(this.getA(), 2));
    }
}
