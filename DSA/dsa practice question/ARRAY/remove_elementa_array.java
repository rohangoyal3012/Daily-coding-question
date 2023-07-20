import java.util.Scanner;
public class remove_elementa_array {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("enter index");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==x){
                System.out.print("");
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }

    }
}


