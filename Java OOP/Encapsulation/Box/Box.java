package Encapsulation.Box;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }


    public double getLength() {
        return length;
    }

    private void setLength(double length) {

        validateValue(length, "Length");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        validateValue(width, "Width");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        validateValue(height, "Height");
        this.height = height;
    }


    private void validateValue(double value, String dimention) {
        if(value <= 0){
            throw new IllegalArgumentException(dimention + " cannot be zero or negative.");
        }
    }


    public double calculateSurfaceArea(){
        return 2 * this.getLength() * this.getWidth() +
                2 * this.getLength() * this.getHeight() +
                2 * this.getWidth() * this.getHeight();
    }


    public double calculateLateralSurfaceArea(){
        return 2 * this.getLength() * this.getHeight() +
                2 * this.getWidth() * this.getHeight();
    }

    public double calculateVolume(){
        return this.getHeight() * this.getWidth() * this.getLength();
    }
}
