import java.util.Scanner;

class IncomeTax {
    
    double inputIncome() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your gross income in INR: Rs.");
        double income = sc.nextDouble();
        
        return income;
    }
    
    double calculateTax(double income) {
        double tax = 0;
        double appIncome = 0;
        
        if (income <= 250000) {
            tax = 0;
        } else if (income >= 250001 && income <= 500000) {
            appIncome = income - 250000;
            tax = 0.05 * appIncome;
        } else if (income >= 500001 && income <= 1000000) {
            appIncome = income - 500000;
            tax = 12500 + (0.20 * appIncome);
        } else { // income > 1000000
            appIncome = income - 1000000;
            tax = 112500 + (0.30 * appIncome);
        }
        
        return tax;
    }
    
    void displayResult(double income, double tax) {
        System.out.println("\nIncome Tax calculated on Gross Income of Rs." + income + " is Rs." + tax);
    }
    
    public static void main(String args[]) {

        IncomeTax ob = new IncomeTax();
        
        double income = ob.inputIncome();
        double tax = ob.calculateTax( income );
        
        ob.displayResult( income, tax );
    }
}