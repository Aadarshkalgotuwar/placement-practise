import java.util.*;
import java.util.Scanner;

public class floyd{
    public static void floyd_tri(int n){
        int counter = 1;
        for(int i=1; i<=n ; i++){
          for(int j=1; j<= i;j++){
            
            System.out.print(counter + "  ");
            counter++;
           
    
          }
          System.out.println();
        }
      }
    
    
    public static void main(String args[]){
        floyd_tri(6);
    }
}