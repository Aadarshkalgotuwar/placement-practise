import java.util.*;
import java.util.Arrays;
import java.util.Scanner;


public class Array{
    public static int LinearSearch(int numbers[] , int key){
        for(int i = 0 ; i<=numbers.length;i++){
            if(numbers[i]==key){
              return i;  
        }
      
    }
    return -1;
}

  //  public static void Update(int marks[]){
     //   for(int i =0;i<marks.length;i++){
       //     marks[i]=marks[i];
 //       }
   // }
    public static void main (String args[]){
        int marks[]={12,45,63,6,3,2,57,25};
        int numbers[]={24,67,55,9,6,567,10,7,57,44};
        int key=10;
        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println(index);
        }
     //  Update(marks);
      // for(int i=0;i<marks.length;i++){
      //  System.out.println(marks[i]+" ");
     //  }
      // System.out.println();

    }
}