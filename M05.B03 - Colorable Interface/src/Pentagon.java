public class Pentagon extends GeometricObject implements Colorable {

    public Pentagon(){

    }

    public double getPentagonArea(double side){
        double pentagonArea = .25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))* Math.pow(side, 2));
        return pentagonArea;
    }
}
