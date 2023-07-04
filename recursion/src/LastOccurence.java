public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
        if(arr[i] == key && isFound == -1){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]= {2,4,2,6,3,7,9,4,3,9,2,5,3,6,2};
        System.out.println(lastOccurence(arr,9,0));
    }
}
