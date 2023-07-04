package important_Qus;

public class Second_Smallest_And_Second_Largest {
    public static void main(String[] args) {
        //How do you find the second smallest and second largest element in an array in Java?

        int arr[] = {1,2,4,2,5,3,77,3,34,6};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondSmallest);
        System.out.println(secondLargest);
    }
}
