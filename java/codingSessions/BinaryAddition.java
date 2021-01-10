
/**
 * WAP to input 2 Binary Numbers in 2 arrays and add them:
 * 
 * Rules:
 * 
 * 0 + 0 = 0
 * 0 + 1 = 1
 * 1 + 0 = 1
 * 1 + 1 = 10 (0 with carry 1)
 * 
 * Eg:
 * 
 * Number 1: 10101010
 * Number 2: 11001100
 * 
 * Sum  = 101110110
 *
 * @author (Mayank Tripathi)
 * @version (10/01/2021)
 */


import java.util.Scanner;

class BinaryAddition {
    
    int inputNumber() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" : ");
        int n = sc.nextInt();
        
        return n;
    }
    
    void inputBinaryArray(int m[]) {
        BinaryAddition ob = new BinaryAddition();
        
        System.out.println("\n\n Please enter your number bit by bit:");
        for (int i = 0; i < m.length; i += 1) {
            int n = ob.inputNumber();
            
            if (n == 0 || n == 1) {
                m[i] = n;
            } else {
                System.out.println(" " + n + " is not a valid binary number. please enter the bit again.");
                i -= 1;
            }
        }
    }
    
    void addBinaryNumbers(int a[], int b[], int sum[]) {
        int carry = 0;
        for (int i = a.length - 1; i >= 0; i -= 1) {
            int e1 = a[i];
            int e2 = b[i];
            
            int s = e1 + e2 + carry;
            
            switch(s) {
                case 2:
                    sum[i + 1] = 0;
                    carry = 1;
                    break;
                case 3:
                    sum[i + 1] = 1;
                    carry = 1;
                    break;
                default:
                    sum[i + 1] = s;
                    carry = 0;
            }
        }
        
        sum[0] = carry;
    } 
    
    void displayNumbers(int m[]) {
        for (int i = 0; i < m.length; i += 1) {
            System.out.print(" " + m[i]);
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        
        BinaryAddition ob = new BinaryAddition();
        
        // Input Number of bits of the binary number
        System.out.println(" How many bits do you want in your numbers?");
        int bits = ob.inputNumber();
        
        // Input both numbers
        int a[] = new int[bits];
        int b[] = new int[bits];
        int sum[] = new int[bits + 1];
        
        ob.inputBinaryArray(a);
        ob.inputBinaryArray(b);
        
        // Add both numbers
        ob.addBinaryNumbers(a, b, sum);
        
        // Display result
        
        System.out.print("\n\n Number 1: ");
        ob.displayNumbers(a);
        
        System.out.print(" Number 2: ");
        ob.displayNumbers(b);
        
        System.out.print(" Sum: ");
        ob.displayNumbers(sum);
    }
    
}
