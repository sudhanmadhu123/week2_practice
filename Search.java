import java.util.Scanner;
class Search{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=0;
    int arr[]={12,22,34,56,78,54,21,25};
    System.out.println("Enter the number to check whether it is present in the list or not:");
    int num=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(num==arr[i]){
      count++;
    }
    }
    if(count>0){
         System.out.println("The number is present");
      }
      else{
         System.out.println("The number is not present");
      }
  }   
}