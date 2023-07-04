import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4};

        for(int i=0; i<arr.length-1; i++){
            int num = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[num] > arr[j]){
                    num = j;
                }

            }
            int temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
