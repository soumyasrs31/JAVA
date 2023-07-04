package important_Qus;

import java.util.Arrays;

public class Rotate_Array {
    //How do you rotate an array to the right by a given number of steps in Java?
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2;

// Reverse the entire array
        reverse(numbers, 0, numbers.length - 1);

// Reverse the first k elements
        reverse(numbers, 0, k - 1);

// Reverse the remaining elements
        reverse(numbers, k, numbers.length - 1);

        System.out.println("Rotated array: " + Arrays.toString(numbers));




    }
}

