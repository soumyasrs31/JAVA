public class CheckPrimeOptimize {
    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeNum(int num){
        if(num == 1 || num == 0){
            return;
        }
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        primeNum(50);
    }
}
