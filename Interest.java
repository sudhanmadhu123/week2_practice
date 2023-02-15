import java.util.Scanner;
class Interest {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int amount=10000,total;
     double rate=0.1,timeperiod=0.00274,si;
     si=amount*(1+(rate*timeperiod))-amount;
     System.out.println("The simple interest is:" +si);
     System.out.println("The principle amount is:" +amount);
     System.out.println("The total amount is:" +(si+amount));
   }
}
/*import java.util.Scanner;
class Interest
{
    public static void main(String arg[])
    {
    int Pamount=0,rate=0,choice=0,day,month,year,temp;
    double time=0.0,si=0.0,total;
        Scanner s=new Scanner(System.in);
    System.out.println("Enter the principle amount");
    Pamount=s.nextInt();
    System.out.println("Enter the Annual rate");
    rate=s.nextInt();  
      System.out.println("Enter the Time period");
    System.out.println("1. Day");
    System.out.println("2. Month");
    System.out.println("3. Year");
    choice=s.nextInt(); 
      rate=rate/100;
    if(choice==1)
    {
      System.out.println("Enter how many days");
      day=s.nextInt();
      temp=day/365;
      si= Pamount* (1+(rate*temp));
    System.out.println("The simple interest is" + si);
    System.out.println("The Principal Amount is" + Pamount);
    System.out.println("The Total value is" + (si+Pamount));
    }
    else if(choice==2)
    {
      month=s.nextInt();
      month=month/12;
      si= Pamount* (1+(rate*month)) - Pamount; 
    }
      else
    {
      year=s.nextInt();
      si= Pamount* (1+(rate*year)) - Pamount;
    }       
    }
}*/