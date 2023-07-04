package important_Qus;

public class Max_Difference {
    public static void main(String[] args) {
        //How do you find the maximum difference between two elements in an array in Java?
        int[] numbers = {5, 2, 8, 1, 4};
        int min = numbers[0];
        int maxDifference = 0;

        for (int i = 1; i < numbers.length; i++) {
            int difference = numbers[i] - min;
            maxDifference = Math.max(maxDifference, difference);
            min = Math.min(min, numbers[i]);
        }

        System.out.println("The maximum difference is: " + maxDifference);

    }
}
