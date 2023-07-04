
import java.util.*;
public class MaximumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(1);
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            /*if(max < list.get(i)){
                max = list.get(i);*/
            maxi = Math.max(maxi,list.get(i));

        }
        System.out.println(maxi);


    }
}

