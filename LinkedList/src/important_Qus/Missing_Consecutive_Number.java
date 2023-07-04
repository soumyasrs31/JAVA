package important_Qus;

public class Missing_Consecutive_Number {
    public static void main(String[] args) {
        //How do you find the missing number in an array of consecutive integers in Java?
        int[] numbers = {1, 2, 3, 5, 6};
        int n = numbers.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            actualSum += numbers[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);

    }
}
