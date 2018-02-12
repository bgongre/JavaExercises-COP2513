import java.util.ArrayList;

public class ShuffleArray {

    public static <E> void shuffle(ArrayList<E> list){
        for (int i = 0; i < list.size(); i++){
            int arrayIndex = (int)(Math.random() * list.size());
            E arrTemp = list.get(i);
            list.set(i, list.get(arrayIndex));
            list.set(arrayIndex, arrTemp);
        }
    }

}
