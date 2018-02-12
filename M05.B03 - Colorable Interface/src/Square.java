public class Square extends GeometricObject implements Colorable{

    public Square(){

    }

    public double getSquareArea(double side){
        double squareArea = Math.pow(side, 2);
        return squareArea;
    }

}
