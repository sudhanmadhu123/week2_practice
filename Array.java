class Array {
 public static void main(String args[]){
   int arr[]={1,2,3,4,5,6};
   int esum=0,osum=0,ecount=0,ocount=0,sum=0;
   for(int i=0;i<arr.length;i++){
 if(arr[i]%2==0)
 {
   ecount++;
   esum=esum+arr[i];
   
 }
     else{
       ocount++;
       osum=osum+arr[i];   
     }
     sum=sum+arr[i];
   }
     System.out.println("even sum is:"+esum);
     System.out.println("odd sum is:"+osum);
     System.out.println("even count is:"+ecount);
     System.out.println("odd count is:"+ocount);
      System.out.println("sum of all elements is:"+sum);
   }
 }

  
     

     
     
   
 

 
  
     