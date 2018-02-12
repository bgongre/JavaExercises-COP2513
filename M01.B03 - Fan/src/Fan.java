public class Fan {

    //constants
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //variables
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //default constructor
    public Fan(){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //getter for speed
    public int getSpeed(){
        return this.speed;
    }

    //setter for speed
    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    //getter for on
    public boolean getOn(){
        return this.on;
    }

    //setter for on
    public void setOn(boolean newOn){
        this.on = newOn;
    }

    //getter for radius
    public double getRadius(){
        return this.radius;
    }

    //setter for radius
    public void setRadius(int newRadius){
        this.radius = newRadius;
    }

    //getter for color
    public String getColor(){
        return this.color;
    }

    //setter for color
    public void setColor(String newColor){
        this.color = newColor;
    }

    //method toString returns string displaying fan and information
    public String toString (){
        System.out.println("Your current fan speed is: " + getSpeed());
        System.out.println("The fan is on? " + getOn());
        System.out.println("The radius of your fan is " + getRadius());
        System.out.println("The color of your fan is " + getColor());
        return color;
    }
}
