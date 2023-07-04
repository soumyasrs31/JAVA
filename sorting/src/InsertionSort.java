import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3,5,1,2,4};
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
