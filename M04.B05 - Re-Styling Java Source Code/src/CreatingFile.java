import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFile {

    public static void main(String args[]) throws IOException{

        //12.13 WriteData (this block creates file named "random" unless it is already created)
        java.io.File file = new java.io.File("random.txt");
        if(file.exists()){
            System.out.println("File already exists.");
            System.exit(1);
        }

        //create file to write to
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        //write to file
        output.print("This is some text to test\n This is a line test.");
        output.print("This is some other test with a number 13413242135\n This is another line test");
        output.print("This is a test with special characters !@#$%^&*()(.");
        output.print("This is a mix of the two !@#$%($7894520136.");

        //close output
        output.close();

        //calls on each random method and prints each one
        System.out.println("Number of Words: " + countWords());
        System.out.println("Number of Lines: " + countLines());
        System.out.println("Number of Characters: " + countChars());

    }

    //method to count all words within random.txt
    public static int countWords() throws FileNotFoundException {
        Scanner input = new Scanner(new File("random.txt"));
        int countWords = 0;
        while (input.hasNextLine()) {
            String word = input.next();
            countWords++;
        }
        return countWords;
    }

    //method to count the lines used for the text in random.txt
    public static int countLines() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File("random.txt"));
        int countLines = 0;
        while (input2.hasNextLine()) {
            String line = input2.nextLine();
            countLines++;
        }
        return countLines;
    }

    //method to count all the characters in random.txt
    public static int countChars() throws FileNotFoundException {
        Scanner input3 = new Scanner(new File("random.txt"));
        int countChar = 0;
        while(input3.hasNextLine()) {
            String line = input3.nextLine();
            for(int i=0; i < line.length(); i++){
                    countChar++;
            }
        }
        return countChar;
    }
}
