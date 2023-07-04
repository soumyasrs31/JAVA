package important_Qus;

public class Longest_Increasing_Subarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 2, 4, 5};
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        System.out.println("The length of the longest increasing subarray is: " + maxLength);

    }
}

