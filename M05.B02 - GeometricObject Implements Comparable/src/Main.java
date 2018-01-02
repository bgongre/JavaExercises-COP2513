public class Main {

    public static void main(String args[]) {

        GeometricObject c1 = new Circle(4);
        GeometricObject c2 = new Circle(7);
        GeometricObject maxCircle;
        maxCircle = GeometricObject.max(c1, c2);
        System.out.println(maxCircle.toString());


        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(8, 8);
        GeometricObject maxRectangle;
        maxRectangle = GeometricObject.max(r1, r2);
        System.out.println(maxRectangle.toString());
    }

}