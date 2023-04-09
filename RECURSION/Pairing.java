public class Pairing {
    public static int friendPairing(int n ){
        if(n==1||n==2){
            return n;
        }
        //single choice
        int fnm1 = friendPairing(n-1);
        //into the pair
        int fnm2 = friendPairing(n-2);

        int pairways = (n-1)*fnm2;
        //total ways 
        int totalways = fnm1 + pairways;
        return totalways;
    }
    public static void main(String[]args){
     System.out.println(friendPairing(3));
    }
}