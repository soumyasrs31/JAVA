public class qus1 {
    public static void main(String[] args) {
        int arr[] = {1,3,4};
        int k = 5;
        int n = arr.length;
        int sum = 0;
        int pos = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            }
        for(int i=0; i<n; i++){
            int secSum = sum;
            if((arr[i] + k) > secSum-arr[i]){
                pos++;
            }
        }
        System.out.println(pos);
    }
}
