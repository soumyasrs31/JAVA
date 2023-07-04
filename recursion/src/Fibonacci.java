public class Fibonacci {
    public static int Nth(int a, int b, int n){
       if(n==0 || n==1){
           return n;
       }
        int nth = Nth(a,b,n-1) + Nth(a,b,n-2);
       return nth;

       /* if(n== 1){
           return a;
       }
       if(n==2){
           return b;
       }
       for(int i=2; i<n; i++){
            int temp = a+b;
            a = b;
            b = temp;
            return b}
               */
    }
    public static void main(String[] args) {
        int a =0, b=1;
        int Nth_Element_value = 10;
        System.out.println(Nth(a,b,Nth_Element_value));
    }
}
