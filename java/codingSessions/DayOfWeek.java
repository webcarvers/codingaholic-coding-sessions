import java.util.Scanner;

class DayOfWeek {
    
    int inputNumber() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number between 1 - 7: ");
        int n = sc.nextInt();
        
        return n;
    }
    
    void displayWeekDay(int n) {
        switch(n) {
            case 1:
                System.out.println(n + "\t = \t Sunday");
                break;
            case 2:
                System.out.println(n + "\t = \t Monday");
                break;
            case 3:
                System.out.println(n + "\t = \t Tuesday");
                break;
            case 4:
                System.out.println(n + "\t = \t Wednesday");
                break;
            case 5:
                System.out.println(n + "\t = \t Thursday");
                break;
            case 6:
                System.out.println(n + "\t = \t Friday");
                break;
            case 7:
                System.out.println(n + "\t = \t Saturday");
                break;
            default:
                System.out.println("\n\nInvalid entry!! Please enter the correct number.\n\n");
        }
    }
    
    boolean validate(int n) {
        boolean isValid = (n >= 1 && n <= 7);
        
        if (!isValid) {
            System.out.println("\n\nInvalid entry!! Please enter the correct number.\n\n");
        }
        
        return isValid;
    }
    
    public static void main(String args[]) {
        
        DayOfWeek ob = new DayOfWeek();
        
        int n;
        boolean isValid;
        
        do {
            n = ob.inputNumber();
            
            isValid = ob.validate(n);
        } while (!isValid);
        
        System.out.println("\n\n");
        
        ob.displayWeekDay(n);
    }
    
}
