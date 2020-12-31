/**
 * WAP to print n elements of the below series
 *
 * Ex:
 * 
 * n = 5
 * 
 * Output:
 * 
 * 1  4  9  16  25
 *
 * @author Mayank Tripathi
 * @version 31/12/2020
 */

import java.util.Scanner;

class SquareSeries {
    
    int input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" How many elements do you want in the series?");
        System.out.print(" : ");
        
        int n = sc.nextInt();
        
        return n;        
    }
    
    void squareSeries(int elements) {
         System.out.println("\n\n");
        
        for (int i = 1; i <= elements; i += 1) {
            long square = (long) Math.pow(i, 2);
            
            System.out.print(" " + square + "\t");
        }
    }
    
    void squareSeries2(int elements) {
         System.out.println("\n\n");
        
        for (int i = 1; i <= elements; i += 1) {
            long square = (long) Math.pow(i, 2) - i;
            
            System.out.print(" " + square + "\t");
        }
    }
    
    public static void main(String args[]) {
        SquareSeries ob = new SquareSeries();
        
        int elements = ob.input();
        
        ob.squareSeries(elements);
        // ob.squareSeries2(elements);
    }
    
}
