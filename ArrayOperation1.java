import java.util.Scanner;
class ArrayOperation {
  Scanner s=new Scanner(System.in);
  int arr[]=new int[100];
  int no_elements=0;
  public void insertFirst(){
    System.out.println("Enter the value to insert in the first index position");
    int  num=s.nextInt();
    
  if(no_elements==0){
      arr[0]=num;
      no_elements++;
   }
    else{
      for(int i=no_elements;i>0;i++){
        arr[i]=arr[i-1];
      }
      arr[0]=num;
      no_elements++;
      }
    }
  public void insertLast(){
    System.out.println("Enter your value to insert in last index ");
    int num=s.nextInt();
    if(no_elements==0){
      arr[0]=num;
      no_elements++;
}
  else {
      arr[no_elements]=num;
      no_elements++;
}
}
  public void display(){
    for(int i=0;i<no_elements;i++)
{
    System.out.print(arr[i]+" ");
  }
 viewOptions();
}
  public void viewOptions() {
    System.out.println("1. Insert an element in first index position");
      System.out.println("2. Insert an element in last index position");
    System.out.println("choose your option");
    int option=0;
    do{
      option=s.nextInt();
      switch(option){
        case 1:
          {
          insertFirst();
          display();
        }
        case 2:
          {
            insertLast();
            display();
          }
      }
 }
      while(option!=0);
  }
  public static void main(String args[]) {
    ArrayOperation obj = new ArrayOperation();
    obj.viewOptions();
  }
}


  
    