import java.util.*;

public class ShowStack extends ArrayList{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //create a new stack
        Stack myStack = new Stack();

        //enter in 5 stack strings
        System.out.println("Enter 5 words and I will display them in reverse order");
        System.out.println("Please enter the first word:");
        String firstWord = input.nextLine();
        myStack.push(firstWord);

        System.out.println("Please enter the second word:");
        String secondWord = input.nextLine();
        myStack.push(secondWord);

        System.out.println("Please enter the third word:");
        String thirdWord = input.nextLine();
        myStack.push(thirdWord);

        System.out.println("Please enter the fourth word:");
        String fourthWord = input.nextLine();
        myStack.push(fourthWord);

        System.out.println("Please enter the fifth word:");
        String fifthWord = input.nextLine();
        myStack.push(fifthWord);

        //call method to reverse stack
        reverse(myStack);

    }

    //method to reverse stack input
    private static void reverse(Stack myStack) {
        //returns reverse of natural ordering on collection of objects
        Collections.reverse(myStack);
        System.out.println("The input in reverse order: " + myStack.toString());
    }

}

