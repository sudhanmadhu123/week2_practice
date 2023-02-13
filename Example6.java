import java.util.Scanner;
class Example6 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num1;
    System.out.println("enter the number");
    num1=s.nextInt();
    if(num1%2==0)
    {
       System.out.println("Num1 is even");
      
    }
      else if(num1==0){
         System.out.println("Num1 is zero");
      }
    else{
       System.out.println("Num1 is odd");
    }
  }
}
    
    
  