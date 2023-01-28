import java.util.*;
import java.util.Scanner;

public class functions{
   //FACTORIAL
    public static int factorial( int n ){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;


    }
    //MULTIPLY
    public static int multiply(int i ,int j){
        int mul = i*j;
        return mul;
    }
    //binomial
    public static int binomial(int k ,int m){
        int bi = factorial(k)/(factorial(k-m)*factorial(m));
        return bi;

    }
    //prime no
    public static boolean Prime(int n){
        boolean Prime=true;
        for(int i=1 ;i<=n-1;i++){
            if (n%2==0) {
                Prime = false;
                break;
            }
           
        }
           return Prime;
    }
    

    public static void main(String args[]){
        System.out.println("factorial of no 4 is"+ factorial(4));
        System.out.println("multiplication of two nos is "+ multiply(9,10));
        System.out.println("binomial coef" +  binomial(4, 3));
        System.out.println(Prime(1));
    }
}