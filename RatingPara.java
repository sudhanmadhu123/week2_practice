class RatingPara {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter your parameter");
    int para=s.nextInt();
    int count=0;
    int arr[][] = { { 4, 6, 2, 5 }, { 7, 9, 4, 8 }, { 6, 9, 3, 7 } };
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if(para<arr[i][j]){
          count=count+1;
        }
      }
    }
    System.out.println(count);
  }
}
  
