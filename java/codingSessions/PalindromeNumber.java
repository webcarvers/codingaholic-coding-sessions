/**
 * WAP to check if the given number is a Palindrome number or not
 *
 * Ex:
 * 
 * Input: 12321
 * Output: Palindrome
 * 
 * Input: 12345
 * Output: Not Palindrome
 *
 * @author Mayank Tripathi
 * @version 30/12/2020
 */

import java.util.Scanner;

class PalindromeNumber {
    
    int input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter a number to check for Palindrome: ");
        int n = sc.nextInt();
        
        return n;
    }
    
    int reverseNumber(int n) {
        int rev = 0;
        
        while (n != 0) {
            int lastDigit = n % 10;
            
            rev  = (rev * 10) + lastDigit;
            
            n /= 10;
        }
        
        return rev;
    }
    
    boolean checkPalindrome(int n) {
        PalindromeNumber ob = new PalindromeNumber();
        
        int rev = ob.reverseNumber( n );
        
        // if (rev == n) {
            // return true;
        // } else {
            // return false;
        // }
        
        return (rev == n);
    }
    
    void display(int n, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\n\n " + n + " is a palindrome number.");
        } else {
            System.out.println("\n\n " + n + " is NOT a palindrome number.");
        }
    }
    
    public static void main(String args[]) {
        
        PalindromeNumber ob = new PalindromeNumber();
        
        int n = ob.input();
        boolean isPalindrome = ob.checkPalindrome(n);
        
        ob.display(n, isPalindrome);
        
    }
    
}
