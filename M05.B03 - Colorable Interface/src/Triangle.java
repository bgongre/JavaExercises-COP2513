public class Triangle extends GeometricObject implements Colorable {

    public Triangle(){

    }

    public double getTriangleArea(double base, double height){
        double triangleArea = .50 * base * height;
        return triangleArea;
    }
}
