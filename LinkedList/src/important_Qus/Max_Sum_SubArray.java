package important_Qus;

//How do you find the maximum sum subarray in an array in Java?
public class Max_Sum_SubArray {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("The maximum sum of subarray is: " + maxSum);

    }
}
