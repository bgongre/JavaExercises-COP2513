public class Circle extends GeometricObject {

    private int radius;

    public Circle(int radius){
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public double getArea(){
        double circleArea = Math.PI * getRadius() * getRadius();
        return circleArea;
    }

    public String toString(){
        return "The larger circle is: " + getArea() ;
    }

}
