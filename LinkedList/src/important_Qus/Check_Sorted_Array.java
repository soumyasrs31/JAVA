package important_Qus;

//How do you check if an array is sorted in ascending order in Java?
public class Check_Sorted_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean isSorted = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("The array is sorted in ascending order: " + isSorted);

    }
}
