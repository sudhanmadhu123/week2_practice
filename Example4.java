import java.util.Scanner;
class Example4 {
 public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int bs=0;
    int bill1=0,bill2=0,bill3=0,total=0;
    float p=0f;
    System.out.println("enter the basic salary:");
    bs=s.nextInt();
   System.out.println("enter the bills:");
    bill1=s.nextInt();
    bill2=s.nextInt();
    bill3=s.nextInt();
    total=bill1+bill2+bill3;
    p=(total/bs)*100;
    System.out.println("total shopping bill is"+total);
    System.out.println("percentage is"+p);
  }
}
    
    
    
    
    
  
  