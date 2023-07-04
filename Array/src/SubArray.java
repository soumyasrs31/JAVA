//brute force (max subarray sum) TC = O(n^3)
//total no of subArray = n(n+1)/2
public class SubArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int maxSubArraySum;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                maxSubArraySum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                    maxSubArraySum += arr[k];
                }
                System.out.println();

                if(max < maxSubArraySum){
                    max = maxSubArraySum;

            }
            count++;
            }
        }
        System.out.println("Total no of SubArray is "+ count);
        System.out.println("max sum of subarray is "+ max);
    }
}
