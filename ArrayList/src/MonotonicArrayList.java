//An Arraylist is monotonic if it is either monotone increasing or monotone decreasing
import java.util.*;
public class MonotonicArrayList {
    public static boolean monotonicArrayList(ArrayList<Integer> list){
       int incre=0; int decres=0;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) <= list.get(i+1)) {
                incre++;
            }
            if(list.get(i) >= list.get(i+1)){
                decres++;
            }
            if(incre>0 && decres>0){
                return false;
            }

            }
        return true;
    }
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(monotonicArrayList(list));
    }
}
