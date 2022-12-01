import java.util.Scanner;
public class Main {
 /*  public static void sym(int a ,int b){
    int sum =  num1 + num2;
  }*/
  public static  int factorial(int n){
    int f=1;
    for (int i=1;i<=n;i++){
      f=f*i;
    }
    return f;
  }
  public static boolean isPrime(int n){
    boolean isPrime=true;
    for(int i=1;i<=n-1;i++){
      if(n%i==0){
        isPrime=false;
        break;
      }
    }
    return isPrime;
  }
  /**
 * @param n
 * @return
 */


  /**
   * @param binNum
   */
  /*public static void binToDec(int binNum){
    int myNum=binNum;
    int pow=0;
    int decNum=0;

    while(binNum>0){
      int lastDigit =binNum%10;
      decNum=decNum+(lastDigit* (Math.pow(2,pow)));
      pow++;
      binNum=binNum/10;

      
    }
    System.out.println(decNum);
  }*/
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
  public static int num(int numbers[],int key){
    for(int i = 0;i<=numbers.length;i++){

      if(numbers[i]==key){
        return i;
      }
      
        
      
    }
    return -1;
    

  }
  public static int largest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i< numbers.length;i++){
    if(largest<numbers[i]){
      largest=numbers[i];

    }
  }
  return largest;
  }
  /**
   * @param args
   */

   public static void Bubblesort(int arr[]){
    for(int turns=0;turns<arr.length-1;turns++){
      for(int j=0;j<arr.length-1-turns;j++){
        if(arr[j]>arr[j+1]){
          //swapping 
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }

   }
   public static void printarray(int arr[]){
    for(int i = 0 ;i<arr.length;i++){
      System.out.print(arr[i]+"");
    }
    System.out.println();
   }
   
  public static void main(String[] args) {
    int arr[]={5,3,9,2,1};
    Bubblesort(arr);
    printarray(arr);
    int n=4;
    char cha='A';
     /* 
      int numbers[] = {1,2,3,4,11,44,66,33,7};
   


    int index = num(numbers, key);
    if(index==-1){
      System.out.println("not found");

    }else{
      System.out.println(index);
    }
    System.out.println("the key is at index"+ index);
  // hollowRec(20, 30);*/

//System.out.println(largest(numbers));   
   
   
for (int i=0;i<=10;i++){
  for(int star=1;star<i;star++){
    System.out.println();
  }

    System.out.println();


  }
  for(int line=1;line <=8;line++){
    for (int chars =1; chars<= line ;chars ++){
      System.out.print(cha);
      cha++;
      
    }
    System.out.println();
    }

    System.out.println(factorial(5));
   
  }
}





  
    


    

   
  



