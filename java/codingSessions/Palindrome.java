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
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

class Palindrome {
    
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
        Palindrome ob = new Palindrome();
        
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
        
        Palindrome ob = new Palindrome();
        
        int n = ob.input();
        boolean isPalindrome = ob.checkPalindrome(n);
        
        ob.display(n, isPalindrome);
        
    }
    
}
