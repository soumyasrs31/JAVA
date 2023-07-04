package important_Qus;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //How do you copy one array into another in Java?

        //4 methods
        int[] originalArray = {1, 2, 3, 4, 5};

// Method 1: Using the arraycopy() method
        int[] copiedArray1 = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray1, 0, originalArray.length);

// Method 2: Using the clone() method
        int[] copiedArray2 = originalArray.clone();

// Method 3: Using the Arrays.copyOf() method
        int[] copiedArray3 = Arrays.copyOf(originalArray, originalArray.length);

// Method 4: Using the Arrays.copyOfRange() method
        int[] copiedArray4 = Arrays.copyOfRange(originalArray, 0, originalArray.length);

// Print the original and copied arrays
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Copied array 1: " + Arrays.toString(copiedArray1));
        System.out.println("Copied array 2: " + Arrays.toString(copiedArray2));
        System.out.println("Copied array 3: " + Arrays.toString(copiedArray3));
        System.out.println("Copied array 4: " + Arrays.toString(copiedArray4));

    }
}
