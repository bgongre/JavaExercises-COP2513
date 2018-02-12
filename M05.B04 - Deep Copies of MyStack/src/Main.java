public class Main {

    public static void main(String[] args){

        //create new stack with 5 numbers
        MyStack s1 = new MyStack();
        for(int i = 0; i < 5; i++){
            s1.push(i);
        }

        //create a second stack that is cloned from the first stack
        MyStack s2 = (MyStack) s1.clone();

        //remove two numbers from first stack to test proper cloning
        s1.pop();
        s1.pop();

        //print both stack sizes
        System.out.println("Stack 1 size: " + s1.getSize());
        System.out.println("Stack 2 size: " + s2.getSize());


    }

}
