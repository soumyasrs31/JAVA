import java.util.*;

//Tc is n^2
public class PrefixSum {
    public static int subArray(int arr[]){
        int currValue ;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int start = i;
                int end = j;

                currValue = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(max<currValue){
                    max = currValue;
                }
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        System.out.println(subArray(arr));
    }
}
