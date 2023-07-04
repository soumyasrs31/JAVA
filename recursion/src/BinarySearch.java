import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[] , int key){
        int start =0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]< key){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }

    return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,5,2,7,5,8};
        Arrays.sort(arr);

        System.out.println(binarySearch(arr,7));
    }
}
