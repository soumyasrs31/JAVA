package important_Qus;

import java.util.Arrays;

public class Reverse_Array_Part2 {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,6};
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
