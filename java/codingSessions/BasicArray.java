import java.util.Scanner;

class BasicArray {
    
    int inputNumber() {
        Scanner ob = new Scanner(System.in);
        
        System.out.print(" : ");
        int n = ob.nextInt();
        
        return n;
    }
    
    public static void main(String args[]) {
        /**
         * - Input Length of array
         * - Input the elements of the array containing the length defined above
         * - Print the sum of numbers those were input
         */
        
        BasicArray ob = new BasicArray();
        
        // Input Length of Array
        System.out.println(" How many elements do you want in your array?");
        int l = ob.inputNumber();
        
        // Input Elemnts of Array and calculate sum
        int a[] = new int[l];
        int sum = 0;
        
        System.out.println("\n\n Enter all elements of your array below: ");
        for (int i = 0; i < a.length; i += 1) {
            a[i] = ob.inputNumber();
            
            sum += a[i];
        }
        
        // Print the sum of numbers those were input
        
        System.out.println("\n\n Sum of all elements in your array is: " + sum);
    }
    
}
