public class CountingSort {
    public static void main(String[] args) {
        //O(n+range)
        int arr[] = {1,2,1,2,5,3,3,6};
        int large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(large < arr[i]){
                large = arr[i];
            }
        }
        int arr2[] = new int[large+1];
        for(int i=0; i<arr.length; i++){
            arr2[arr[i]]++;
        }
        for(int i=0; i<arr2.length; i++){
            while(arr2[i]-- >0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
