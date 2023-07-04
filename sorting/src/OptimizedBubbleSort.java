public class OptimizedBubbleSort {
    // TC = O(n^2) //worst case
    // TC = O(n) //best case

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void optimizedBubbleSort(int arr[]){
        boolean sort = false;
        for(int i = 0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sort = true;
                }
            }
            if(sort == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,4,7};
        optimizedBubbleSort(arr);
        printArr(arr);
    }
}
