package important_Qus;

public class Avg_Of_Element {
    public static void main(String[] args) {
        int arr[] = {1,34,2,554,7,54};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double average = (double)sum /arr.length;
        System.out.println(average);
    }
}
