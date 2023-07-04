public class BackTracking_On_Array {
    public static void updateArray(int arr[], int i, int val){
        if(i == arr.length){
            print(arr);
            return;
        }
        arr[i] = val;
        updateArray(arr,i+1,val+1);
        arr[i] = val - 2;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        updateArray(arr,0,1);
        print(arr);
    }
}
