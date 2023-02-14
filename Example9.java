import java.util.Scanner;
class Example9 {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
    System.out.println("Enter number to print palindrome or not ");
int num=s.nextInt();
 int rev=0,rem;
  int temp=num;
 while(num!=0){
   rem=num%10;
 rev=(rev*10)+rem; 
num=num/10; 
 }
    if(temp==rev)
    {
      System.out.println("it is a palindrome number");
    }
    else{
      System.out.println("it is not a palindrome");
    }
}
}