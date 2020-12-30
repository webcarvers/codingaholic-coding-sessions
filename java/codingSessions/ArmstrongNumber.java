/**
 * WAP to check if the given number is an Armstrong number or not
 *
 * Ex:
 * 
 * Input: 371
 * Output: Armstrog
 * 
 * Input: 123
 * Output: Not Armstrong
 *
 * @author Mayank Tripathi
 * @version 30/12/2020
 */

import java.util.Scanner;

class ArmstrongNumber
{
    int input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Enter the number to check for Armstrong: ");
        int n = sc.nextInt();
        
        return n;
    }
    
    int getDigitCount(int n) {
        int digitCount = 0;
        
        while(n != 0) {
            digitCount += 1;
            
            n /= 10;
        }
        
        return digitCount;
    }
    
    boolean checkArmstrong(int n) {
        ArmstrongNumber ob = new ArmstrongNumber();
        
        long sum = 0;
        int dup2 = n;
        int digitCount = ob.getDigitCount(n);
        
        while (dup2 != 0) {
            int lastDigit = dup2 %10;
            
            sum += Math.pow(lastDigit, digitCount);
            
            dup2 /= 10;            
        }
        
        return sum == n;
    }
    
    void display(int n, boolean isArmstrong) {
        if (isArmstrong) {
            System.out.println(" " + n + " is an Armstrong Number.");
        } else {
            System.out.println(" " + n + " is not an Armstrong Number.");
        }
    }
    
    public static void main(String args[]) {
        ArmstrongNumber ob = new ArmstrongNumber();
        
        int n = ob.input();
        boolean isArmstrong = ob.checkArmstrong(n);
        
        ob.display(n, isArmstrong);
    }
}
