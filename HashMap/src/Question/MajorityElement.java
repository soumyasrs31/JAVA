package Question;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = 0;
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        Set<Integer> keys = hm.keySet();
        for(Integer k : keys){
            if(hm.get(k) > arr.length/3){
                System.out.println(k);
            }
        }
    }
}
