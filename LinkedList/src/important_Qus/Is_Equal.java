package important_Qus;

import java.util.Arrays;

public class Is_Equal {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,5,4};
        boolean isEqual = Arrays.equals(arr1,arr2);
        System.out.println(isEqual);
    }
}
