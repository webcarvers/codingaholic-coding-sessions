import java.util.Scanner;

class PrimeSeries {
    
    boolean checkPrime(int n) {
        int countfactors = 0;
        
        for (int i = 1; i <= n; i += 1) {
            if (n % i == 0) {
                countfactors += 1;
            }
        }
        
        // if (countfactors == 2) {
            // return true;
        // } else {
            // return false;
        // }
        
        return (countfactors == 2);
    }
    
    int input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many prime numbers do you want?");
        System.out.print(" : ");
        
        int n = sc.nextInt();
        
        return n;        
    }
    
    void printSeries(int n) {
        PrimeSeries ob = new PrimeSeries();
        
        int countPrime = 0;
        
        System.out.println("\n\n");
        
        for (int i = 1; countPrime < n; i += 1) {
            if (ob.checkPrime(i)) {
                System.out.print(i + "\t");
                
                countPrime += 1;
            }
        }
    }
    
    public static void main(String args[]) {
        PrimeSeries ob = new PrimeSeries();
        
        int n = ob.input();
        
        ob.printSeries(n);
    }
}
