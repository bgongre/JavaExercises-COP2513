import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {

    @Override
    //create cloneable with generic type, if not compatible types throw exception
    public MyPriorityQueue<E> clone() throws CloneNotSupportedException {
        MyPriorityQueue<E> temp = new MyPriorityQueue<>();
        temp.addAll((MyPriorityQueue<E>)super.clone());
        return temp;
    }

}
