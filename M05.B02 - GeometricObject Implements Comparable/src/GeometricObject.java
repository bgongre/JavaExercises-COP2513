public abstract class GeometricObject implements Comparable<GeometricObject>{

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2){
        if(((Comparable)obj1).compareTo(obj2) > 0)
            return obj1;
        else
            return obj2;
    }

    @Override
    public int compareTo(GeometricObject obj){
        if(this.getArea() > obj.getArea())
            return 1;
        else if (this.getArea() < obj.getArea())
            return -1;
        else
            return 0;
    }

    public abstract double getArea();

}
