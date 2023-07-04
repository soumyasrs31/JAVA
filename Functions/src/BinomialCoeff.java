public class BinomialCoeff {
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        int n=5,r=2;
        //nCr = n!/r!(n-r)!

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_min_r = factorial(n-r);

        System.out.println(fact_n/(fact_r*fact_n_min_r));
    }
}
