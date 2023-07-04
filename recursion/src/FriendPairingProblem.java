public class FriendPairingProblem {
    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }


        //work
        //single choice
       int fnm1 = friendPairing(n-1);
       //pairing choice
       int fnm2 = friendPairing(n-2);
       int pairWays = (n-1) * fnm2;
       return fnm1 + pairWays;
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));

    }
}
