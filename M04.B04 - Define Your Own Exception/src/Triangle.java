public class Triangle{

    //variables
    private double side1;
    private double side2;
    private double side3;
    private String color;
    private boolean filled;

    //default constructor
    public Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;

    }

    //specific constructor
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException{
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
                triangleSides(side1, side2, side3);
    }

    //specified constructor
    public Triangle(String color, boolean filled){
        this.color = color;
        this.filled = filled;
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

    //getter color
    public String getColor() {
        return color;
    }

    //setter color
    public void setColor(String color) {
        this.color = color;
    }

    //getter filled
    public boolean isFilled() {
        return filled;
    }

    //setter filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //method getArea() for Triangle area
    public double getArea(){
        double s = (getSide1() + getSide2() + getSide3()) / 2;
        double triangleArea = Math.sqrt(s*(s - getSide1())*(s- getSide2())*(s-getSide3()));
        return triangleArea;
    }

    public double getPerimeter(){
        double trianglePerimeter = getSide1() + getSide2() + getSide3();
        return trianglePerimeter;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public void triangleSides(double newSide1, double newSide2, double newSide3)
        throws IllegalTriangleException{
        if(newSide1 + newSide2 > newSide3 && newSide1 + newSide3 > newSide2 && newSide2 + newSide3 > newSide1){
                    side1 = newSide1;
                    side2 = newSide2;
                    side3 = newSide3;
        }else{
            throw new IllegalTriangleException(newSide1, newSide2, newSide3);
        }
    }
}
