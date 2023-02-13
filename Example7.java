import java.util.Scanner;
class Example7 {
  public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     int num1;
    System.out.println("enter the number");
    num1=s.nextInt();
    if(num1<0)
    {
      System.out.println("Num1 is negative");
    }
    else{
      System.out.println("Num1 is positive");
    }
  }
}