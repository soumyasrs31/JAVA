import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Sample {
    /*public static void main(String[] args) {
        Integer arr[] = {3,4,5,1,5,6,7}; //O(nlogn)
        //here arr is the object of class Integer..

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.reverseOrder());
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }*/

    /*// Bubble sort ...

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int count = 0;
        boolean sort = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    sort = true;
                }
            }
            count++;
            if(sort == false){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));

        System.out.println(count);
    }*/
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                //Descending order
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        //descending order
        for(int i=0; i<arr.length-1; i++){
            int small = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[small] < arr[j]){
                    small=j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSorts(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //descending order
            while(prev >=0&& arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void countingSort(int arr[]){
        Arrays.sort(arr);
        int large = arr[arr.length-1];
        int arr2[]= new int[large+1];
        for(int i=0; i<arr2.length; i++){
            arr2[arr[i]]++;
        }
        for(int i=arr2.length-1; i>=0; i--){
            while(arr2[i]-- > 0){

                System.out.print(i+" ");

            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        //bubbleSort(arr);

        // selectionSort(arr);

        //insertionSorts(arr);
        countingSort(arr);
        //System.out.println(Arrays.toString(arr));
    }
}
