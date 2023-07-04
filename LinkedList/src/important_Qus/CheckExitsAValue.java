package important_Qus;

public class CheckExitsAValue {
    public static void main(String[] args) {
        //How do you sort an array in ascending order in Java?
        int arr[] = {10,20,30,40,50};
        int key = 90;
        boolean check = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                check = true;
                break;
            }
        }
        if(check == true){
            System.out.println("exists");

        }else{
            System.out.println("not exists");
        }
    }
}
