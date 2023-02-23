class AscendingOrder{
  public static void main(String args[]){
    int arr[]={4,2,1,46,7,2,9};
    int temp=0;
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          
        }
      }
    }
    System.out.println("Ascending order of the given array is:");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}