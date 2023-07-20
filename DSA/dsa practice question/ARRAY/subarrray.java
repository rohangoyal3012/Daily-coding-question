import java.util.Scanner;

public class subarray {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        // System.out.println(arr.length);
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                // System.out.println("("+i+","+j+")");
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
                System.out.println(" ");
        }
    }
}
