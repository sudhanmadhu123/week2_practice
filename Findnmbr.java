import java.util.Scanner;
class Findnmbr{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
        int arr[] = {48,89,33,33,12,67,18,45,75,145,87,13,};
      int n;
      System.out.println("Enter the number to find whether it is present or not");
  n=s.nextInt();
      for(int i=0;i<arr.length;i++){
      if(arr[i]==n){
        System.out.println("The number is present");
        break;
      }
        else{
          System.out.println("The number is not present");
          break;
        }
      }
    }
}