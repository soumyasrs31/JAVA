import java.util.*;
public class Qus3 {
    public static int stockProfit(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,5,4,3,1};
        System.out.println(stockProfit(arr));
    }
}
