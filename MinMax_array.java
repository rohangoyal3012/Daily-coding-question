//minmax element form the array


import java.util.Scanner;


public class minmax {
    public static void MinMax(int arr[]){
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("maximum value is "+max);
   System.out.println("minimum value is "+ min); 
   
    

}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] = {6,4,54,65,3,5,7,8,3456,65,1};
        MinMax(arr);
    }
}
