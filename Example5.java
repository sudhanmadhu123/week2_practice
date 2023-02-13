import java.util.Scanner;
class Example5 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int bs=0;
    int gs;
    int hra,da;
    System.out.println("enter the basic salary:");
    bs=s.nextInt();
    hra=(89*bs)/100;
    da=(90*bs)/100;
    gs=bs+hra+da;
     System.out.println("The gross salary is"+gs);
  }
}
    
    
    
    
    