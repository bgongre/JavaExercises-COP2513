import java.text.DecimalFormat;

public class TestingMyPoint {

    public static void main(String[] args) {

        //default constructor
        MyPoint defaultPoint = new MyPoint();

        //specified points
        MyPoint P1 = new MyPoint(0,0);

        //distance between points, given coordinates
        P1.distance(10,30.5);

    }
}