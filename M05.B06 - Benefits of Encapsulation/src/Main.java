public class Main {

    public static void main(String args[]){

        Rational r1 = new Rational(1, 1254);
        Rational r2 = new Rational(1, 7845);
        Rational r3 = new Rational(1, 6512);
        Rational r4 = new Rational(1, 9845);
        System.out.println("r1 * r2 * r3 is: " + r1.multiply(r2.multiply(r3)));

    }

}
