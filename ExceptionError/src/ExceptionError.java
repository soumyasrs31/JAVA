public class ExceptionError {
    public static void main(String[] args) {
        try{
            int arr[] = {1,2,3};
            System.out.println(arr[10]);
        }catch(Exception e){
            System.out.println("something went wrong");
        }finally{
            System.out.println("try..catch statements are executed");
        }
    }
}
