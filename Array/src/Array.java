import java.util.*;

public class Array {
    //array value is reflected by reference... but nonchangable value not changed..
    /*public static void update(int arr[], int nonChangebleValue){
        nonChangebleValue = 10;
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nonChangebleValue = 5;
        int arr[] = {50, 53, 34};
        update(arr, nonChangebleValue);
        System.out.println(nonChangebleValue);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }*/
    // LinearSearch in array...
    /*public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,15};
        int key = 10;
        int index = linearSearch(arr,key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println(index);
        }
    }*/

    // string linear search...

    /*public static int linearSearch(String arr[], String key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = {"Apple", "Banana", "Orange", "sepeta"};
        String key = "Orange";
        int index = linearSearch(arr,key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println(index);
        }
    }*/

    // Search a largest and smallest value in an array..

    /*public static int largestValue(int arr[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
              smallest = arr[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return largest;

    }
    public static void main(String[] args) {
        int arr[] = {2,6,2,65,23,65,21,75,34};
        System.out.println(largestValue(arr));
    }*/

    // Binary Search of an array....


    /*public static int binarySearch(int arr[], int key){
        int start = 0; int end = arr.length -1;
        while(arr[start] <= arr[end]){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = end - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18};
        int key = 18;
        int index = binarySearch(arr, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println(index);
        }
    }*/

    //Reverse a array..

    /*public static void reverseArray(int arr[]){
        int start = 0; int end = arr.length -1;
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,46,22,65,234,3};
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }*/

    //Print different pairs of numbers in an array...

    /*public static void pairNumbers(int arr[]){
        int totalPairs = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    continue;
                }else {
                    System.out.print("("+arr[i]+","+arr[j]+")");
                    totalPairs++;

                }


            }
            System.out.println();
        }System.out.println(totalPairs);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,20,34,54,54};
        pairNumbers(arr);
    }
*/

    // print sub array..

    /*public static void printSubArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int totalsubarraydigitsum = 0;
        int totalNoSubarray = 0;
        for(int i=0; i<arr.length; i++){  //for start subarray
            for(int j=i; j<arr.length; j++){  //for end subarray
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    totalsubarraydigitsum += arr[k];

                }
                System.out.println("     total sum of subarray is "+ totalsubarraydigitsum);
                if(max < totalsubarraydigitsum){
                    max = totalsubarraydigitsum;
                }
                totalsubarraydigitsum = 0;
                totalNoSubarray++;
            }
            System.out.println();
        }
        System.out.println("maximum value of sum of subarray is "+ max);
        System.out.println(totalNoSubarray);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7};
        printSubArray(arr);
    }*/

    //Maximum sum of subArray...
    /*public static void maxSumSubArray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length;j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                    currSum += arr[k];
                }
                System.out.println("Total sum is " +currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();

        }
        System.out.println("The maximum sum is "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSumSubArray(arr);
    }*/

    





}
