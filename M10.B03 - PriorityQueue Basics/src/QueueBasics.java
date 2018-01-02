import java.util.Arrays;
import java.util.PriorityQueue;

public class QueueBasics {

    public static void main(String[] args) {

        //create priority queue1 and priority queue2
        PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList(
                "George", "Jim", "John", "Blake", "Kevin", "Michael"));

        PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList(
                "George", "Katie", "Kevin", "Michelle", "Ryan"));

        //display the two queues
        System.out.println("Set1: " + queue1);
        System.out.println("Set2: " + queue2);

        //display queues union, difference, and intersection
        System.out.println("Union of sets: " + union(queue1, queue2));
        System.out.println("Difference of sets: " + difference(queue1, queue2));
        System.out.println("Intersection of sets: " + intersection(queue1, queue2));
    }

    //method to return the union
    private static <T> PriorityQueue<T> union(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> union = new PriorityQueue<>(set1);
        union.addAll(set2);
        return union;
    }

    //method to return the difference
    private static <T> PriorityQueue<T> difference(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> difference = new PriorityQueue<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    //method to return the intersection
    private static <T> PriorityQueue<T> intersection(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> intersection = new PriorityQueue<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
