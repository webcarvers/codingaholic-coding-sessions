/**
 * WAP to check if the given number is a Perfect number or not
 *
 * Ex:
 * 
 * Input: 6
 * Output: Perfect
 * 
 * Input: 8
 * Output: Not Perfect
 *
 * @author Mayank Tripathi
 * @version 30/12/2020
 */

import java.util.Scanner;

public class PerfectNumber
{
    int input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter the number you want to check for Perfect: ");
        int n = sc.nextInt();
        
        return n;
    }
    
    boolean checkPerfect(int n) {
        int sum = 0;
        
        for (int i = 1; i < n; i += 1) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return (sum == n);
    }
    
    void display(int n, boolean isPerfect) {
        if (isPerfect) {
            System.out.println("\n\n " + n + " is a Perfect Number.");
        } else {
            System.out.println("\n\n " + n + " is Not a Perfect Number.");
        }
    }
    
    void getSeries(int limit) {
        PerfectNumber ob = new PerfectNumber();
        
        System.out.println(" All Perfect numbers till " + limit + " are:");
        
        for (int i = 1; i <= limit; i += 1) {
            if (ob.checkPerfect(i)) {
                System.out.print(" " + i + "\t");
            }
        }
    }
    
    
    public static void main(String args[]) {
        PerfectNumber ob = new PerfectNumber();
        
        int n = ob.input();
        
        boolean isPerfect = ob.checkPerfect(n);
        
        ob.display(n, isPerfect);
        
        // ob.getSeries(500);
    }
    
}
