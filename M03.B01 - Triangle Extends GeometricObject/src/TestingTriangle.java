import java.util.Scanner;

public class TestingTriangle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //get input for 3 sides of the triangle
        System.out.println("Please enter length of first side:");
        double side1 = input.nextDouble();
        System.out.println("Please enter length of second side:");
        double side2 = input.nextDouble();
        System.out.println("Please enter length of third side:");
        double side3 = input.nextDouble();

        //get input for color of triangle
        System.out.println("What color would you like your triangle?");
        String color = input.next();

        //get true of false depending on if triangle is filled
        System.out.println("Is your triangle filled? True or False?");
        boolean filled = input.nextBoolean();

        //new triangle constructor
        Triangle T1 = new Triangle(side1, side2, side3);

        //set colors listed from input
        T1.setColor(color);
        T1.setFilled(filled);

        System.out.println("The area of the triangle is: " + T1.getArea());
        System.out.println("The perimeter of the triangle is: " + T1.getPerimeter());
        System.out.println("The color of the triangle is: " + T1.getColor());
        System.out.println("Is the triangle filled? " + T1.isFilled());

    }

}
