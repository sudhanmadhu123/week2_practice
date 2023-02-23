class MaxMinSecondMax {   
public static void main(String args[]){     
int arr[]={10,45,34,23,89,64,88,77};       
int max=0,secondMax=0,min=0;        
max=arr[0];      
  min=arr[0];        
for(int i=1;i<arr.length;i++){        
if(max<arr[i]){          
secondMax=max;   
max=arr[i];     
}        
else if(secondMax<arr[i]){           
secondMax=arr[i];          
}         
if(min>arr[i]){          
min=arr[i];        
}              
}     
System.out.println("Max value: "+max);        
System.out.println("Second Max value: "+secondMax);  
  System.out.println("Min  value: "+min);           
}
}