package important_Qus;

import java.util.ArrayList;
import java.util.Arrays;

public class Common_Elements_In_Multiple_Array {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,3,5,6};
        int arr3[] = {1,3,4,5};
        ArrayList<Integer> a = new ArrayList<>();
        //first find common elements bet^n two array

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                for(int k=0; k<arr3.length; k++){
                    if(arr3[k] == arr2[j] && arr3[k] == arr1[i]){
                        a.add(arr3[k]);

                    }
                }
            }
        }
        System.out.println(a);

    }
}
