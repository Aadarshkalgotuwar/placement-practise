import java.util.*;
import java.util.Scanner;

public class advpatt{
    public static void hollowRec(int row , int col){
        for(int i=1; i<=row ; i++){
          for(int j=1; j<= col;j++){
            if(i==1||i==row||j==1||j==col){
              System.out.print("*");
            }
            else{
              System.out.print(" ");
            }
           
    
          }
          System.out.println();
        }
      }
      public static void Inverted(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

      }
    
    public static void main(String args[]){
        hollowRec(4, 4);
        Inverted(6);
    }
}