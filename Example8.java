import java.util.Scanner;
class Example8 {
   public static void main(String args[]){
     Scanner s=new Scanner(System.in);
       int age;
     System.out.println("enter the age");
     age=s.nextInt();
     if(age>18)
     {
        System.out.println("Eligible for voting");
     }
     else{
        System.out.println("Not eligible for voting");
     }
   }
}