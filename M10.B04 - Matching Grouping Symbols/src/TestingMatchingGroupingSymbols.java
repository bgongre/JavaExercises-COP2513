import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class TestingMatchingGroupingSymbols {

    public static void main(String[] args) throws IOException {

        //check command-line argument
        if (args.length != 1) {
            System.out.println("Usage: Java TestingMatchingGroupingSymbols Source-codeFileName");
            System.exit(0);
        }

        //check if the file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The file " + args[0] + " does not exist!");
            System.exit(1);
        }

        //create symbols stack
        Stack<Character> symbols = new Stack<>();

        try ( //create in put stream for a file
              Scanner input = new Scanner(file);
        ) {
            //while loop to read characters from file
            while (input.hasNext()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    //push the symbols in to stack
                    if (ch == '(' || ch == '{' || ch == '[') {
                        symbols.push(ch);
                    } //process stack
                    else if (ch == ')' || ch == '}' || ch == ']') {
                        processSymbols(symbols, ch);
                    }
                }
            }
        }

        System.out.println("The Java source-code " +
                (symbols.isEmpty() ? "has" : "does not have") + " correct pairs.");
    }

    //method to match grouping symbols
    private static void processSymbols(
            Stack<Character> stack, Character ch) {
        //remove duplicate symbols from the stack
        if ((stack.peek() == '(' && ch == ')') ||
                (stack.peek() == '[' && ch == ']') ||
                (stack.peek() == '{' && ch == '}')) {
            stack.pop();
        }
        else if ((stack.peek() != '(' && ch == ')') ||
                (stack.peek() != '[' && ch == ']') ||
                (stack.peek() != '{' && ch == '}')) {
            System.out.println("The Java source-code does not have"
                    + " correct pairs.");
            System.exit(1);
        }
    }
}
