package important_Qus;

//How do you find the smallest missing positive integer in an unsorted array in Java?
public class Smallest_missing_positive_integer {
    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1};
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            while (numbers[i] > 0 && numbers[i] <= n && numbers[numbers[i] - 1] != numbers[i]) {
                int temp = numbers[numbers[i] - 1];
                numbers[numbers[i] - 1] = numbers[i];
                numbers[i] = temp;
            }
        }

        int smallestMissing = 1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] != i + 1) {
                smallestMissing = i + 1;
                break;
            }
        }

        System.out.println("The smallest missing positive integer is: " + smallestMissing);

    }
}
