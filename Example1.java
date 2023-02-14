import java.util.Scanner;
class Example1 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num,i=1,count=0;
      System.out.println("enter the number to find numbr of factors:");
     num=s.nextInt();
    while(i<=num/2)
      {
        if(num%i==0)
        {
          count=count+1;
           
        }
       i=i+1;
      }
    System.out.println("The number of factors is" +count);
  }
}
    
    
    
    