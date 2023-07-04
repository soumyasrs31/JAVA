public class Pratice {
    public static int sum(int n){
        int sumNum = 0;
        if(n == 1){
            return 1;
        }

        sumNum = n + sum(n-1);

        return sumNum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
