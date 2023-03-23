import java.util.*;

public class Recursion{
//printing a no from 1 to 10
    public static void printInc(int n ){
        if(n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        printInc(n+1);
    }
    //print the factorial of a given number
    public static int fact(int n){
        if(n==1){
            return 1;
        }
       // int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;

    }
    //print the first n natural numbers
    
    public static int calcSum(int n){
        if(n==1){
            return 1;

        }
        int sm1 = calcSum(n-1);
        int sm = n + sm1;
        return sm;
    }

public static void main(String []args){
    int n=5;
   //printInc(n);
   //System.out.println( fact(n));
  System.out.println(calcSum(n));
}
};