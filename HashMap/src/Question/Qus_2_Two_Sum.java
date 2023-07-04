package Question;

import java.util.HashMap;

public class Qus_2_Two_Sum {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7};//all inputs are distinct
        int target = 4;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int diff = target - arr[i];

            if(hm.containsKey(diff)){
                System.out.println(i +", "+ hm.get(diff));
            }
            hm.put(arr[i], i);
        }

    }
}
