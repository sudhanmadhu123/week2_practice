import java.util.Scanner;
class Example10 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int unit;
    double charge=0f;
      System.out.println("enter the number of units");
    unit=s.nextInt();
    if(unit<=50){
      charge=unit*0.50;
    }
    else if(unit<=150)
    {
      charge=(50*0.50)+(unit-50)*1.23;
    }
    else if(unit<=250){
      charge=(50*0.50)+(100*1.23)+(unit-150)*1.90;
    }
    else{
      charge=(50*0.50)+(100*1.23)+(100*1.90)+(unit-250)*2.34;
    }
     System.out.println("the bill is"+charge);
  }
}
    
