package important_Qus;
//How do you find the maximum product of two integers in an array in Java?
public class Max_Product_Two_Integer {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max2 = max1;
                max1 = numbers[i];
            } else if (numbers[i] > max2) {
                max2 = numbers[i];
            }
        }

        int maxProduct = max1 * max2;

        System.out.println("The maximum product of two integers is: " + maxProduct);


    }
}
