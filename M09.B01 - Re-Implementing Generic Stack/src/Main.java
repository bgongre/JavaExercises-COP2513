public class Main {
        public static void main(String[] args) {

            //first stack holds strings
            GenericStack<String> stack1 = new GenericStack<>();
            stack1.push("London");
            stack1.push("Paris");
            stack1.push("Berlin");

            //second stack holds integers
            GenericStack<Integer> stack2 = new GenericStack<>();
            stack2.push(1);
            stack2.push(2);
            stack2.push(3);

            //display stack 1
            System.out.print("Stack 1: ");
            while (!stack1.isEmpty()) {
                System.out.print(stack1.pop() + " ");
            }
            System.out.println("\n");

            //display stack 2
            System.out.println("Stack 2: ");
            while(!stack2.isEmpty()) {
                System.out.print(stack2.pop() + " ");
            }
        }
    }

