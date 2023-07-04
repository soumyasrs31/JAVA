package important_Qus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Element {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 2, 4, 5};
        Set<Integer> uniqueSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            uniqueSet.add(numbers[i]);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;

        for (int element : uniqueSet) {
            uniqueArray[index++] = element;
        }

        System.out.println("Array with unique elements: " + Arrays.toString(uniqueArray));


    }
}
