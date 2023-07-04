package important_Qus;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            // Swap elements at start and end positions
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            // Move the pointers
            start++;
            end--;
        }

        System.out.println("The reversed array is: " + Arrays.toString(numbers));

    }
}