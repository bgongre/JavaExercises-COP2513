public class Circle extends GeometricObject implements Colorable {

    public Circle(){

    }

    public double getCircleArea(double radius){
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }
}
