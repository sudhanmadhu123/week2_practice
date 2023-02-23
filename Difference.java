import java.util.Scanner;
class Difference {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int n,sum = 0, remainder, product = 1, difference;
        System.out.println("Enter the number to find the difference of product and sum:");
  n=s.nextInt();
     while(n!=0){
        remainder = n % 10;
      product = product * remainder;
      sum = sum+remainder;
      n = n/10;
    }
    difference = product-sum;
    System.out.println("different between sum and product in given number is  " + difference);
  }
}
     