import java.util.Comparator;

public class ComparePointY implements Comparator<Point>{

    //compare two points Y-coordinates
    public int compare(Point p1, Point p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        if (y1 == y2) {
            //if two points have same Y-coordinate compare their X-coordinate
            if (x1 < x2)
                return -1;
            else if (x1 == x2)
                return 0;
            else
                return 1;
        }
        else if (y1 < y2)
            return -1;
        else
            return 1;

    }
}
