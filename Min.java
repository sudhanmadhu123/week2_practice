class Min {   
public static void main(String args[]){     
int arr[]={14,3,78,66,13,18,98};       
int max=0, min=0;        
max=arr[0];    min=arr[0];        
for(int i=1;i<arr.length;i++){        
if(max<arr[i]){           
max=arr[i];     
}                           
if(min>arr[i]){          
min=arr[i];        
}
}
  System.out.println("Minimum value:"+min);
}
}