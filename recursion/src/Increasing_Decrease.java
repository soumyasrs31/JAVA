public class Increasing_Decrease {
    public static void increase(int num){
        if(num == -1 ){
            return;
        }
        //increase
        increase(num-1);
        System.out.println(num);
    }
    public static void decrease(int num){
        if(num == -1){
            return;
        }
        System.out.println(num);
        decrease(num-1);
    }
    public static void main(String[] args) {
       int num = 10;
       //increase(num);
       decrease(num);
    }
}
