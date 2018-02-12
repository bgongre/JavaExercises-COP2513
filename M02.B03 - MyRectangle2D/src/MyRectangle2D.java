import java.text.DecimalFormat;

public class MyRectangle2D {

    private static DecimalFormat df1 = new DecimalFormat(".##");//To reduce numbers after decimal points when calculating the area and perimeter

    //variables
    double x;
    double y;
    double width;
    double height;

    //getter x
    public double getX() {
        return x;
    }

    //setter x
    public void setX(double x) {
        this.x = x;
    }

    //getter y
    public double getY() {
        return y;
    }

    //setter y
    public void setY(double y) {
        this.y = y;
    }

    //getter width
    public double getWidth() {
        return width;
    }

    //setter width
    public void setWidth(double width) {
        this.width = width;
    }

    //getter height
    public double getHeight() {
        return height;
    }

    //setter height
    public void setHeight(double height) {
        this.height = height;
    }

    //default MyRectangle2D
    public MyRectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height =1;
    }

    //specific MyRectangle2D
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //method getArea() returns area of rectangle
    public double getArea(){
         double rectangleArea = (getWidth() * getHeight());
        System.out.println("The area of the rectangle is: " + df1.format(rectangleArea));
        return rectangleArea;
    }

    //method getPerimeter() returns perimeter of rectangle
    public double getPerimeter(){
        double getLength = ((getWidth() * getHeight()) / getWidth());
        double rectanglePerimeter = 2 * (getLength + getWidth());
        System.out.println("The perimeter of the rectangle is: " + df1.format(rectanglePerimeter));
        return rectanglePerimeter;
    }

    //method contains(double x, double y) returns true if point is inside rectangle
    public boolean contains(double x, double y){
        if((x < getX()) ||  (x > getX() + getWidth()) || (y < getY()) || (y > getY() + getHeight())){
            System.out.println("The point does not reside inside the rectangle");
            return false;
        }else{
            System.out.println("There is a point that resides inside the rectangle");
            return true;
        }
    }

    //method that returns true if rectangle is inside another rectangle
    public boolean contains(MyRectangle2D r){
        MyRectangle2D r1 = r;
        if((getX() +- r1.x < getWidth() + r1.width / 2) && (getY() +- r1.y < getHeight() + r1.height / 2) && (r1.x +- getX() <  r1.width + getWidth() / 2) && (r1.y +- getY() < r1.height + getHeight() / 2)){
            System.out.println("Rectangles are not inside each other");
            return false;
        }else{
            System.out.println("The rectangle contains a rectangle");
            return true;
        }
    }

    //method that checks if rectangles are overlapping(
    public boolean overlaps(MyRectangle2D r){
        MyRectangle2D r1 = r;
        if(x < getX() + (.5 * getWidth()) && x > getX() - (.5 * getWidth()) && y < getY() + (.5 * getHeight()) && y > getY() - (.5 * getHeight())){
            System.out.println("The rectangles are overlapping");
            return true;
        }else{
            System.out.println("The rectangles are not overlapping");
            return false;
        }
    }
}
