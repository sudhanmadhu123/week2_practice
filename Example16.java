import java.util.Scanner;
class Example16{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=0;
    for(int k=1;k<=100;k++)
      {
        count=0;
        for(int i=1;i<=k/2;i++)
          {
            if(k%i==0){
              count++;
            }
          }
        if(count==1){
          System.out.print(k+ " ");
          }
      }
  }
}