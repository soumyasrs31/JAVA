import java.util.*;
public class xAndY{
    public static void main(String[] args) {
        int arr[] = {1,5,3,2,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            int a = arr[num];
            if(map.containsKey(arr[num])){
                map.put(arr[num],map.get(a)+1);
            }else{
                map.put(arr[num],1);
            }
        }
        int max = Integer.MIN_VALUE;
        int maxpre = 0;

        for(Integer n : map.keySet()){
            if(max <= map.get(n)){
                maxpre = max;
                max = map.get(n);

            }
        }

        if(max > maxpre){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}