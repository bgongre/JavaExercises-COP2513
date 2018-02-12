import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //create 100 points randomly
        Point[] points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point((Math.random() * 10), (Math.random() * 10));
        }

        //display points increasing from X-coordinates
        Arrays.sort(points);
        List<Point> list1 = Arrays.asList(points);
        System.out.println("\nPoints in increasing order of their x-coordinates:");
        System.out.println(list1);


        //display points increasing from Y-coordinates
        Arrays.sort(points, new ComparePointY());
        List<Point> list2 = Arrays.asList(points);
        System.out.println("\nPoints in increasing order of their y-coordinates:");
        System.out.println(list2);
    }
}
