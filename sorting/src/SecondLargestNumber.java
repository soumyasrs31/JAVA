import java.util.Arrays;
public class SecondLargestNumber {
    public static void secondLargestElement(int arr[]){
        //counting array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            //largest = Math.max(largest,arr[i])
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
        if(arr.length<2){
            System.out.println("array has no second largest element");
            return;
        }
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] != arr[arr.length-1]){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("there is no existing array");

    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        secondLargestElement(arr);

    }
}
