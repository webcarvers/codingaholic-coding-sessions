import java.util.Scanner;

class DivideMoney {
    long inputAmount() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount to divide in INR: Rs.");
        long amount = sc.nextLong();
        
        return amount;
    }
    
    long handleAmount(long amount, long currency) {
        long notes = amount / currency;
        amount %= currency;
            
        System.out.println(currency + " \t: \t" + notes);
        
        return amount;
    }
    
    void divideMoney(long amount) {
        DivideMoney ob = new DivideMoney();
        
        System.out.println("\n\nAmount - Rs." + amount + "\n\n");
        
        if (amount > 2000) {
            amount = ob.handleAmount(amount, 2000);
        }
        
        if (amount > 500) {
            amount = ob.handleAmount(amount, 500);
        }
        
        if (amount >= 200) {
            amount = ob.handleAmount(amount, 200);
        }
        
        if (amount >= 100) {
            amount = ob.handleAmount(amount, 100);
        }
        
        if (amount >= 50) {
            amount = ob.handleAmount(amount, 50);
        }
        
        if (amount >= 20) {
            amount = ob.handleAmount(amount, 20);
        }
        
        if (amount >= 10) {
            amount = ob.handleAmount(amount, 10);
        }
        
        if (amount >= 5) {
            amount = ob.handleAmount(amount, 5);
        }
        
        if (amount >= 2) {
            amount = ob.handleAmount(amount, 2);
        } 
        
        if (amount >= 1) {
            System.out.println("1 \t: \t" + amount);
        }
    }
    
    
    public static void main(String args[]) {
        
        DivideMoney ob = new DivideMoney();
        
        long amount = ob.inputAmount();
        
        ob.divideMoney( amount );
        
    }
}
