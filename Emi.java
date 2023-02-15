import java.util.Scanner;
class Emi
{
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
       double rinterest, emi, payamount,pamount, month, interest;
    System.out.println("enter the loan amount");
    pamount = s.nextDouble();
    System.out.println("enter the number of months");
    month = s.nextDouble();
    System.out.println("enter the rate of interest");
    rinterest = s.nextDouble();
    emi = pamount / month;
    interest = (pamount * rinterest) / 100;
    payamount = pamount + interest;
    System.out.println("the emi is : " + emi);
    System.out.println("the total interest is : " + interest);
    System.out.println("the total payable amount is : " + payamount);
  }
}
   