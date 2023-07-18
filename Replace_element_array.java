import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
     //   System.out.println("helo");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  size of array");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the index");
        int p = sc.nextInt();
        System.out.println("enter the replace digit");
        int num = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==p){
                System.out.print(num+" ");
            }
            System.out.print(arr[i]+" ");
        }
    

    }
}
