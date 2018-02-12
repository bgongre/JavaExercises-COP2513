public class Rectangle extends GeometricObject {

    private int width;
    private int length;

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

}

