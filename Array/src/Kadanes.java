import java.util.*;
public class Kadanes {
    public static void kadanes(int arr[]){
        int currValue = 0;
        int  maxValue = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currValue += arr[i];
            if(currValue < 0){
                currValue = 0;
            }
            if(maxValue < currValue){
                maxValue = currValue;
            }
        }
        System.out.println(maxValue);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(number);

    }
}
