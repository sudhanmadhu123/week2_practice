import java.util.Scanner;
class EmployeSalary {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int salary,net;
       System.out.println("Enter the salary");
  salary=s.nextInt();
     if (salary<700000){
       net=salary;
       System.out.println("No tax applied");
       System.out.println("The net salary is:" +net);
       
     }
     else{
       if(salary<=900000)
       {
         net=((300000*5)/100)+(((salary-600000)*10)/10);
         System.out.println("The net salary is:" +net);
       }
       else if(salary<=1200000){
         net=((300000*5)/100)+(((salary-600000)*10)/10)+(((salary-900000)*15)/100);
         System.out.println("The net salary is:" +net);
       }
       else{
         net=((300000*5)/100)+(((salary-600000)*10)/10)+(((salary-900000)*15)/100)+(((salary-1200000)*20)/100);
         System.out.println("The net salary is:" +net);
       }
         
       }
     }
}