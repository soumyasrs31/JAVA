package important_Qus;
public class Check_Contain_Specific_Element {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 3;
        boolean checkAvailable = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target ){
                checkAvailable = true;
                break;
            }
        }
        if(checkAvailable == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
