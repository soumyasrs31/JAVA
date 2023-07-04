package important_Qus;

import java.util.Arrays;

public class Median_Of_Array {
    public static void main(String[] args) {


        int[] numbers = {5, 2, 8, 1, 4};
        Arrays.sort(numbers);

        int median;
        int middleIndex = numbers.length / 2;

        if (numbers.length % 2 == 0) {
            median = (numbers[middleIndex - 1] + numbers[middleIndex]) / 2;
        } else {
            median = numbers[middleIndex];
        }

        System.out.println("The median of the array is: " + median);

    }
}
