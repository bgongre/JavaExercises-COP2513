public class IllegalTriangleException extends RuntimeException {

    //variables
    private double side1;
    private double side2;
    private double side3;

    //construct a triangle with the specified sides
    public IllegalTriangleException(double side1, double side2, double side3){
        super("Triangle cannot have two sides sum be greater than the third side of the triangle.");
    }

    //getter side1
    public double getSide1() {
        return side1;
    }

    //getter side2
    public double getSide2() {
        return side2;
    }

    //getter side3
    public double getSide3() {
        return side3;
    }
}
