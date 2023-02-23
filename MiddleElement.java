class MiddleElement{
    public static void main(String args[])
    {
        int arr[] = {48,89,33,12,67,18,45,75,145,87,13,};
        int startIndex = 0, lastIndex = arr.length-1;
        int midIndex = (lastIndex-startIndex)/2;
        System.out.println("The middle element in the given array is:"+arr[midIndex]);
    }
}