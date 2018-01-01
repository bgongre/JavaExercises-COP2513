import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveArrayDuplicates {

        public static void main(String[] args) {

            //new ArrayList
            ArrayList<Integer> newArr = new ArrayList<>(10);

            //Asking for numbers to be input into newArr
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter the first number to be entered into the array:");
            int firstNum = input.nextInt();
            newArr.add(firstNum);

            System.out.println("Please enter the second number to be entered into the array:");
            int secondNum = input.nextInt();
            newArr.add(secondNum);

            System.out.println("Please enter the third number to be entered into the array:");
            int thirdNum = input.nextInt();
            newArr.add(thirdNum);

            System.out.println("Please enter the fourth number to be entered into the array:");
            int fourthNum = input.nextInt();
            newArr.add(fourthNum);

            System.out.println("Please enter the fifth number to be entered into the array:");
            int fifthNum = input.nextInt();
            newArr.add(fifthNum);

            System.out.println("Please enter the sixth number to be entered into the array:");
            int sixthNum = input.nextInt();
            newArr.add(sixthNum);

            System.out.println("Please enter the seventh number to be entered into the array:");
            int seventhNum = input.nextInt();
            newArr.add(seventhNum);

            System.out.println("Please enter the eighth number to be entered into the array:");
            int eighthNum = input.nextInt();
            newArr.add(eighthNum);

            System.out.println("Please enter the ninth number to be entered into the array:");
            int ninthNum = input.nextInt();
            newArr.add(ninthNum);

            System.out.println("Please enter the tenth number to be entered into the array:");
            int tenthNum = input.nextInt();
            newArr.add(tenthNum);

            //calling method to remove duplicates
            removeDuplicate(newArr);

            //printout the array with duplicates removed
            System.out.print("The distinct integers are: ");
            for (int i = 0; i < newArr.size(); i++) {
                System.out.print(newArr.get(i) + " ");
            }

        }

        public static void removeDuplicate(ArrayList<Integer> list) {
            //create new Set
            Set<Integer> removeDup = new LinkedHashSet<>();

            //move all array integers to Set (will not allow duplicates)
            removeDup.addAll(list);

            //remove all current integers from list
            list.clear();

            //move all new integers without duplicates into list
            list.addAll(removeDup);
        }

    }
