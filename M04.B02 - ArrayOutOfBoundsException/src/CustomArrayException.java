import java.util.Random;
import java.util.Scanner;

public class CustomArrayException {

    private static double[] numArray;

    //sets numArray to 100 indexes, for loop to fill them, list() is the method to fill the numArray
    public static double[] list () {
        numArray = new double[99];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = randomFill();
        }
        return numArray;
    }

    //creates random numbers to fill in numArray
    public static double randomFill(){
        Random random = new Random();
        double numRandom = random.nextInt();
        return numRandom;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //calls method to fill numArray with random numbers
        list();

        //asks the user to select an index between 0 and 99
        System.out.println("Please enter an index within the array of 100. (i.e. 0 - 99)");
        int arrayIndex = input.nextInt();

        try {
            if (arrayIndex < 0 || arrayIndex > 99) {
                throw new ArrayIndexOutOfBoundsException();
            }else{
                System.out.println(numArray[arrayIndex]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Out of Bounds");
            }
        }
    }

