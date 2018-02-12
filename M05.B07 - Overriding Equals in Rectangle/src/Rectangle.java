public class Rectangle extends GeometricObject {

    private int width;
    private int length;

    public Rectangle(){

    }

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public double getArea(){
        double rectangleArea = getWidth() * getLength();
        return rectangleArea;
    }

    public String toString(){
        return "The larger rectangle is: " + getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle r = (Rectangle) o;

        return Double.compare(width, r.width) == 0 && Double.compare(length, r.length) == 0;
    }

}
