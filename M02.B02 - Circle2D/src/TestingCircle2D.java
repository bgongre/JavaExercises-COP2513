public class TestingCircle2D {

    public static void main(String[] args){

        //default Circle2D
        Circle2D defaultCircle2D= new Circle2D();

        //new Circle C1
        Circle2D C1 = new Circle2D(2,2,5.5);

        //display area
        C1.getArea();

        //display perimeter
        C1.getPerimeter();

        //display result of contains point inside circle
        C1.contains(3,3);

        //display result of contains circle inside circle
        C1.contains(new Circle2D(4, 5,10.5));

        //display overlapping circle
        C1.overlaps(new Circle2D(3,5,2.3));
    }

}
