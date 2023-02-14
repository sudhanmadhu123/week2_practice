import java.util.Scanner;
class Example8 {
  public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
int num, ecount=0,ocount=0,rem=0;
System.out.println ("Enter number to find no.of even digits and no.of odd digits:");
  num = s.nextInt();
    while(num!=0)
 {
 
      if((num%10)%2==0){
        ecount++;
      }
   else{
     ocount++;
   }
      
 
      
 num=num/10;
 }
System.out.println ("number of even digits "+ecount);
System.out.println ("number of odd digits"+ocount);
  }
}