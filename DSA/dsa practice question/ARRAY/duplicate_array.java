import java.util.Scanner;

public class duplicate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // [1,2,3,4,1]
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count ++;
                    // break;5
                    
                }
            }
        }
        System.out.println(count);
    }
}
