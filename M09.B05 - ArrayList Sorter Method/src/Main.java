import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //list of integers
        Integer[] intArray = {50, 540, -10, 1005, 230, 13, 68};
        ArrayList<Integer> intList =
                new ArrayList<>(Arrays.asList(intArray));

        //list of strings
        String[] stringArray = {"Marge", "Lisa", "Maggie", "Homer", "Bart", "Santa's Little Helper"};
        ArrayList<String> stringList =
                new ArrayList<>(Arrays.asList(stringArray));

        //call sort method for ArrayList
        ArrayListSorter.sort(intList);
        ArrayListSorter.sort(stringList);

        //display sorted lists
        System.out.println("Sorted Integer objects: " + intList);
        System.out.println("Sorted String objects: " + stringList);
    }

}
