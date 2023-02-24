class AvgRating{
public static void main(String[] args) {
   
int arr[][] = { {4,6,2,5}, { 7,9,4,8},{6,9,3,7} };
  int sum=0;
  float avg;
   //for(int i = 0; i <= arr.length; i++) {  
    
            //for(int j = 0; j <= arr[i].length; j++){
              sum=arr[0][3]+arr[1][3]+arr[2][3];
              avg=(float)sum/3;
           // }
//}
     System.out.println("The avg of 4th film is:"+avg);   
}
}
  


  