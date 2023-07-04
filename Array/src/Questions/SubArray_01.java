package Questions;

public class SubArray_01 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int total_subArray = 0; //(n(n+1)/2)
        int max_Sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                max_Sum = Math.max(max_Sum,sum);
                sum = 0;
                total_subArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(total_subArray);
        System.out.println(max_Sum);
    }
}
