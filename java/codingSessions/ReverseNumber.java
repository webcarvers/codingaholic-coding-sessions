/**
 * WAP to input a number and reverse it:
 * Ex:
 * 
 * Input: 123456
 * Output: 654321
 *
 * @author (Mayank Tripathi)
 * @version (29 December 2020)
 */

import java.util.Scanner;

class ReverseNumber {
    
    int input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter the number to be reversed: ");
        int n = sc.nextInt();
        
        return n;
    }
    
    int reverse(int n) {
        int rev = 0;
        
        while (n != 0) {
            int lastDigit = n % 10;
            
            rev = (rev * 10) + lastDigit;
            
            n /= 10;
        }
        
        return rev;
    }
    
    void display(int n, int rev) {
        System.out.println("\n\n Reverse of " + n + " is " + rev);
    }
    
    public static void main(String args[]) {
        
        ReverseNumber ob = new ReverseNumber();
        
        int n = ob.input();
        int rev = ob.reverse( n );
        
        ob.display(n, rev);
    }
    
}
