import java.util.Scanner;
class Operator {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int num1,num2,res;
      System.out.println("Enter the number1:");
  number1=s.nextInt();
      System.out.println("Enter the number2:");
  number2=s.nextInt();
      System.out.println("Enter the operator:+,-,*,/");
     char ch=s.next().charAt(0);
     switch(ch){
       case '+':{
         res = num1 + num2;
         System.out.println("the addition of two number is : " + res);
         break;
       }
          case '-':{
         res = num1 + num2;
         System.out.println("the addition of two number is : " + res);
         break;
             case '*':{
         res = num1 + num2;
         System.out.println("the addition of two number is : " + res);
         break;
             case '/':{
         res = num1 + num2;
         System.out.println("the addition of two number is : " + res);
         break;
       default:{
         System.out.println("Invalid operator");
       }
     }
   }
}