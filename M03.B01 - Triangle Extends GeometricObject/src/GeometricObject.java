public class GeometricObject{

    //variables
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //default constructor
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    //specified constructor
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //comparing two objects
    public interface Comparable<Double>{
        public int compareTo();
    }

    //getter color
    public String getColor() {
        return color;
    }

    //setter color
    public void setColor(String color) {
        this.color = color;
    }

    //getter filled
    public boolean isFilled() {
        return filled;
    }

    //setter filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //getter dateCreated
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    //string representation of object
    public String toString(){
        return "created on" + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }


}

