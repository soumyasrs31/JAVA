import java.util.*;
import java.util.Arrays;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class Qus1 {
    public static boolean checkFunction(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            if(arr[i] == arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-1,-1};
        System.out.println(checkFunction(arr));
    }
}
