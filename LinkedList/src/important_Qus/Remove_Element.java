package important_Qus;

import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int targetIndex = -1;

// Find the index of the target element
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                targetIndex = i;
                break;
            }
        }

        if (targetIndex != -1) {
            // Shift elements after the target position
            for (int i = targetIndex; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            // Reduce the length of the array
            numbers = Arrays.copyOf(numbers, numbers.length - 1);

            System.out.println("The modified array is: " + Arrays.toString(numbers));
        } else {
            System.out.println("The target element is not found in the array.");
        }


    }
}
