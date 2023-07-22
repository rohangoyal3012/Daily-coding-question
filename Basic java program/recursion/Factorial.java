import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int n){
        if(n == 0){
            return 1;
        }
        return findFactorial(n-1)*n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findFactorial(num));



    }
}
