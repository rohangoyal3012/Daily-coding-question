package recursion;

import java.util.Scanner;

public class Palindrome {
    public static int checkPalindrome(String A, int low,int high){
          if(low>=high){
            return 1;
          }
          if(A.charAt(low)!=A.charAt(high)){
            return 0;
          }
         return checkPalindrome(A, low+1, high-1);

        
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int n = A.length();
        System.out.println(checkPalindrome( A , 0 , n-1));
    }
}