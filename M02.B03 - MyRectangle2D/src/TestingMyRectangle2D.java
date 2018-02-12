public class TestingMyRectangle2D {

    public static void  main(String[] args){

        //default rectangle no args
        MyRectangle2D defaultRectangle = new MyRectangle2D();

        //rectangle with args (x, y, width, height)
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);

        //show area
        r1.getArea();

        //show perimeter
        r1.getPerimeter();

        //contains method
        r1.contains(3,3);

        //other contains method
        r1.contains(new MyRectangle2D(4,5,10.5,3.2));

       //overlaps method
        r1.overlaps(new MyRectangle2D(3,5,2.3,5.4));


    }
}
