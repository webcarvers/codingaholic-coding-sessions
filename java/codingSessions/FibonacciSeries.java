/**
 * WAP to print n elements of the Fibonacci Series
 *
 * Ex:
 * 
 * n = 5
 * 
 * Output:
 * 
 * 0  1  1  2  3
 *
 * @author Mayank Tripathi
 * @version 30/12/2020
 */

import java.util.Scanner;

public class FibonacciSeries {
    
    int input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" How many elements do you want in Fibonacci Series?");
        System.out.print(" : ");
        
        int n = sc.nextInt();
        
        return n;
    }
    
    void originalFibonacci(int limit) {
        int a = 0;
        int b = 1;
        int c;
        
        System.out.print("\n\n " + a + "\t" + b + "\t");
        
        for (int i = 3; i <= limit; i += 1) {
            c = a + b;
            
            System.out.print(c + "\t");
            
            a = b;
            b = c;
        }
    }
    
    void cubeFimonacci(int limit) {
        int a = 0;
        int b = 1;
        int c;
        
        System.out.print("\n\n " + a + "\t" + b + "\t");
        
        for (int i = 3; i <= limit; i += 1) {
            c = a + b;
            
            long cube = (long) Math.pow(c, 3);
            
            System.out.print(cube + "\t");
            
            a = b;
            b = c;
        }
    }
    
    public static void main(String args[]) {
        FibonacciSeries ob = new FibonacciSeries();
        
        int limit = ob.input();
        
        ob.originalFibonacci(limit);
        
        // ob.cubeFimonacci(limit);
    }
    
}
