public class FirstOccurence {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
          return i;
        }

       return firstOccurence(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]= {2,4,2,6,3,7,9,4,3,9};
        System.out.println(firstOccurence(arr,9,0));
    }
}
