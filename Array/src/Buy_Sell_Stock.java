import java.util.*;
public class Buy_Sell_Stock {
    public static int profitExample(int arr[]){
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            if(buyStock < arr[i]){
                int profit = arr[i] - buyStock;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyStock = arr[i];
            }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(profitExample(arr));
    }
}
