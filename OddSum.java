class OddSum{   
public static void main(String args[]){     
int arr[]={23,45,12,90,55,33};
int  osum=0;          
for(int i=0;i<arr.length;i++){  
if(arr[i]%2!=0){
osum=osum+arr[i];
}
  }
System.out.print("Odd sum:"+osum); 
 }
}