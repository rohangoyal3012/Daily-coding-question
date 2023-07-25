import java.util.Scanner;

public class target_array {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter the array size
        int n=sc.nextInt();

        System.out.println("enter the array");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("TARGET");
        int target = sc.nextInt();

        for(int i=0;i<=arr.length;i++){
           
            if(arr[i] == target){
                System.out.println(i);
            }
                

            }
        }
        
    }
    
    

