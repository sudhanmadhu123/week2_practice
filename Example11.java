import java.util.Scanner;
class Example11 {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
  int num,t=1;
   System.out.println("Enter number to find the factorial of a given number:");
  num=s.nextInt();
  for(int i=1;i<=num;i++)
    {
      t=t*i;
    }
  System.out.println("The factorial of a given number:"+t);
}
}
  