class Max {
 public static void main(String args[]){
int arr[]={1,12,24,56,78,99};
   int max=0;
   max=arr[0];       
for(int i=1;i<arr.length;i++){        
if(max<arr[i]){          
max=arr[i];  
}
}
  System.out.println("Maximum value :"+max);
}
}
   
   
   