public class Point implements Comparable<Point> {

    private double x;
    private double y;

    //point constructor with parameters
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //set X to specified value
    public void setX(double x) {
        this.x = x;
    }

    //set Y to specified value
    public void setY(double y) {
        this.y = y;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Point point) {
        if (x == point.getX()) {
            //if two points have same X-coordinates compare Y-coordinates
            if (y > point.getY())
                return 1;
            else if (y < point.getY())
                return -1;
            else
                return 0;
        }
        else if (x > point.getX())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", x) + ", "
                + String.format("%.2f", y) + ")";
    }
}
