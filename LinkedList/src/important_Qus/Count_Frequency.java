package important_Qus;

import java.util.Arrays;

//How do you find the frequency of each element in an array in Java?
public class Count_Frequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,3,6,3,4,7,3,4};
        Arrays.sort(arr);
        int maxValue = arr.length-1;
        int arr2[] = new int[maxValue+1];
        for(int i=0; i<arr2.length; i++){
            arr2[arr[i]]++;
        }
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] != 0){
                System.out.println(i + " - "+ arr2[i]);
            }else{
                continue;
            }
        }
    }
}
