public class OptimizeX_to_N {
    //O(logn)

    public static int optimizePower(int x,int n){
        if(n == 0){
            return 1;
        }
        int halfSquare = optimizePower(x,n/2) * optimizePower(x,n/2);
        if(n%2 != 0){
            halfSquare *= x;
        }
       return halfSquare;
    }
    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(optimizePower(x,n));
    }
}
