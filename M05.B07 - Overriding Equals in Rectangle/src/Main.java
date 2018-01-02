public class Main {

    public static void main(String args[]) {

        Rectangle r1 = new Rectangle(8, 8);
        Rectangle r2 = new Rectangle(8, 8);
        GeometricObject maxRectangle;
        maxRectangle = GeometricObject.max(r1, r2);
        System.out.println(maxRectangle.toString());

        if(r1.equals(r2)){
            System.out.println("The rectangles are equal!");
        }else{
            System.out.println("The rectangles are not equal..");
        }

        System.out.println("==============================");

        Rectangle r3 = new Rectangle(10, 8);
        Rectangle r4 = new Rectangle(22, 10);
        GeometricObject maxRectangle1;
        maxRectangle1 = GeometricObject.max(r3, r4);
        System.out.println(maxRectangle1.toString());

        if(r3.equals(r4)){
            System.out.println("The rectangles are equal!");
        }else{
            System.out.println("The rectangles are not equal..");
        }
    }
}
