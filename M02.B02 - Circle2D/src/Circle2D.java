import java.text.DecimalFormat;

public class Circle2D {

    //Shows only two decimal places for the area and perimeter
    private static DecimalFormat df1 = new DecimalFormat(".##");

    //variables
    double x;
    double y;
    double radius;

    //getter x
    public double getX() {
        return this.x;
    }

    //getter y
    public double getY() {
        return this.y;
    }

    //getter radius
    public double getRadius() {
        return this.radius;
    }

    //default
    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    //for constructing your own circle
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //method for area of circle
    public double getArea(){
       double area = (Math.PI * Math.pow(this.radius, 2));
        System.out.println("The area of the circle is: " + df1.format(area));
       return area;
    }

    public double getPerimeter(){
        double perimeter = (2 * Math.PI * this.radius);
        System.out.println("The perimeter of the circle is: " + df1.format(perimeter));
        return perimeter;
    }

    //method returns true if (x,y) is inside the circle
    public double contains(double x, double y){
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        if(Math.pow(distance, 2) < Math.pow(this.radius, 2) || Math.pow(distance, 2) == Math.pow(this.radius, 2)) {
            System.out.println("Does one circle have a point inside the other? " + true);
        }else{
            System.out.println("Does one circle have a point inside the other? " + false);
        }
        return distance;
    }

    //method returns true if second circle is inside first circle (distance is the distance between both circle centers)
    public double contains(Circle2D circle){
        Circle2D C2 = circle;
        double distance = Math.sqrt(Math.pow(C2.x - this.x, 2) + Math.pow(C2.y - this.y, 2));
        if(distance <= Math.abs(this.radius - C2.radius)){
            System.out.println("Circles are inside each other");
        }else{
            System.out.println("Circles are not inside each other");
        }
        return distance;
    }

    //method returns true if circles are overlapping (distance is the distance between both circle centers)
    public double overlaps(Circle2D circle){
        Circle2D C2 = circle;
        double distance = Math.sqrt(Math.pow(C2.x - this.x, 2) + Math.pow(C2.y - this.y, 2));
        if(distance <= Math.abs(this.radius + C2.radius)){
            System.out.println("Circles are overlapping");
        }else{
            System.out.println("Circles are not overlapping");
        }
        return distance;
    }

}
