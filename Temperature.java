import java.util.Scanner;
class Temperature {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     
      System.out.println("Enter the temperature to convert:");
    int temperature=s.nextInt();
    System.out.println("Type 1 for Fahrenheit to Celcius ");
    System.out.println("Type 2 for Celsius to Fahrenheit ");
int Fa,Celcius,F,c;
     int a=s.nextInt();
     if(a==1)
     {
       c = (temperature-32)*(5/9);
System.out.println("fahrenheit to celcius:"+c);
     }
     else{
        Fa = ((temperature*9)/5) + 32;
System.out.println("celcius to fahrenheit:"+Fa);
     } 
        //System.out.println(F + " degree Fahrenheit = " + c + " degree Celsius");
     // System.out.println(Celcius + " degree Celcius = " + Fa + " degree Fahrenheit");
    }
}
/*import java.util.Scanner;
class Temperature {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("to convert celsius to Fahrenheit press 1 ");
    System.out.println("to convert Fahrenheit to celsius press 2 ");
    int tempcelsius, tempFahrenheit, temp;
    temp = s.nextInt();
    if (temp == 1) {
      System.out.println("enter the temperature in Celsius ");
      tempcelsius = s.nextInt();
      tempFahrenheit = (tempcelsius *(9/5)) + 32;
      System.out.println("After convert from celsius to Fahrenheit temperature is " + tempFahrenheit);
    } else if(temp==2){
      System.out.println("enter the temperature in Fahrenheit ");
      tempFahrenheit = s.nextInt();
      tempcelsius = ((tempFahrenheit - 32) * 5) / 9;
      System.out.println("After convert from Fahrenheit to celsius temperature is " + tempcelsius);
    }
  }
}*/