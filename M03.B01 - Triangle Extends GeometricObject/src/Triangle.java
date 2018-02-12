public class Triangle extends GeometricObject{

    //variables
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //default constructor
    public Triangle(){
    }

    //specific triangle
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    //method getArea() returns area of triangle
    public double getArea(){
        //use Heron's formula to find area, first find semiperimeter (sp)
        double sp = .5 * (getSide1() + getSide2() + getSide3());
        double area = Math.sqrt(sp * ((sp - getSide1())) * (sp - getSide2()) * (sp - getSide3()));
        return area; 
    }

    //method getPerimeter() returns perimeter of triangle
    public double getPerimeter() {
        double perimeter = (getSide1() + getSide2() + getSide3());
        return perimeter;
    }

    //method toString() that returns a string description of triangle
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
