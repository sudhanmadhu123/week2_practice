import java.util.Scanner;
class Leap {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int year;
       System.out.println("Enter the year:");
  year=s.nextInt();
     if(year%4==0&&year%400==0)
     {
   System.out.println("its leap year");
    } else {
      System.out.println("its not leap year");
     }
   }
}