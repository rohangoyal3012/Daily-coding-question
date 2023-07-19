import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int a=3;
        // int b=3;
        int sum=1;
        for(int i=1;i<=b;i++){
             sum = sum * a;
        }
        System.out.println(sum);
    }
}
