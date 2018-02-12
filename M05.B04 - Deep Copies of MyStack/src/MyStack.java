import java.util.ArrayList;

public class MyStack implements Cloneable {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public  Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    //create override on MyStack to create deep copy of ArrayList list
    @Override
    public Object clone()  {
        MyStack myListClone = null;
        try {
            myListClone = (MyStack) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        myListClone.list = new ArrayList<>(list);
        return myListClone;
    }

}
