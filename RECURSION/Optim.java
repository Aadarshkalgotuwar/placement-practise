public class Optim{
    public static int optimizedPower(int a , int n ){
        if(n==0){
            return 1;
        }
        int x = optimizedPower(a, n/2);
        int halfPowerSq = x * x;
        if( n%2 !=0 ){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String [] args){
int a = 2 ;
int n = 5 ;
System.out.println(optimizedPower(a, n));
    }
}