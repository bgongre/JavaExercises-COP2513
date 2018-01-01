import java.text.DecimalFormat;

public class MyPoint {

    //makes distance three decimal point places
    private static DecimalFormat df1 = new DecimalFormat(".###");

    //variables
    double x = 0;
    double y = 0;

    //getter x
    public double getX() {
        return x;
    }

    //getter y
    public double getY() {
        return y;
    }

    //default
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    //specific coordinates
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    //method distance that returns distance between points
    public double distance(){
        double distance = Math.sqrt(Math.pow(getX() - this.x, 2) + Math.pow(getY() - this.y, 2));
        return distance;
    }

    //method distance that returns distance from last point to new point
    public double distance(double x, double y){
        double distance = Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2));
        System.out.println("The distance between the two points is: " + df1.format(distance));
        return distance;
    }
}

