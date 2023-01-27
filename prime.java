import java.util.*;
import java.util.Scanner;

public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ;i<=n; i++){
           if( i %2==0){
            System.out.println(i + "it is even no ");}
            else {
                System.out.println(i+ "odd no ");
            }
           }
        }
    }
