import java.util.Scanner;
class Age {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int year,currentyear=2023,age;
      System.out.println("Enter the year:");
 year=s.nextInt();
     
     age=currentyear-year;
     if(age>=18)
     {
        System.out.println("Major");
     }
     else{
        System.out.println("Minor");
     }
   }
}
    