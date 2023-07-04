package important_Qus;
import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        //How do you sort an array in ascending order in Java?

        //for descending order arrange a sorted array it required Integer class..
        Integer []arr= {1,32,54,3,7,5,47,76};
        Arrays.sort(arr ,Collections.reverseOrder());
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
