public class MaximumElementArray {

    public static <E extends Comparable<E>> E max(E[][] list){
       E max = list[0][0];
       for (int i = 1; i < list.length; i++){
           for (int j =1; j < list[i].length; i++){
               if (list[i][j].compareTo(max) > 0)
                   max = list[i][j];
           }
       }
       return max;
    }

}
