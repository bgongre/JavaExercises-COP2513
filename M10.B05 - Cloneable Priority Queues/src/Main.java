public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        //create MyPriorityQueue that accepts string types, add 4 strings
        MyPriorityQueue<String> queue1 = new MyPriorityQueue<>();
        queue1.offer("Stacy");
        queue1.offer("Kevin");
        queue1.offer("Gina");
        queue1.offer("Geoff");

        //clone queue1 to queue2
        MyPriorityQueue<String> queue2 = queue1.clone();

        //add 2 more names to queue2
        queue1.offer("Marcy");
        queue1.offer("Anthony");

        //remove one name from queue2
        queue2.remove();

        //display queue1
        System.out.print("Queue1: ");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println();

        //display queue2
        System.out.print("Queue2: ");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
        System.out.println();
    }
}
