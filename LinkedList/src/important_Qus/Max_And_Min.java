package important_Qus;

public class Max_And_Min {
    public static void main(String[] args) {
        //How do you find the largest element in an array in Java?

        int arr[] = { 2,4,23,65,32,755,233};
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(small);
    }
}
