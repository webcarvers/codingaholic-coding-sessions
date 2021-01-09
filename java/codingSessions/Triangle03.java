
/**
 * 
 *                  #
 *              #       #
 *          #       #       #
 *      #       #       #       #
 * #        #       #       #       #
 * 
 * 
 *                  1
 *              2       3
 *          4       5       6
 *      7       8       9       10
 * 11       12      13      14      15
 * 
 * 
 * @author (Mayank Tripathi)
 * @version (09/01/2021)
 */
public class Triangle03
{
    void pattern01() {
        for (int i = 1; i <= 5; i += 1) {
            
            for (int k = 5; k > i; k -= 1) {
                System.out.print("\t");
            }
            
            for (int j = 1; j <= i; j += 1) {
                System.out.print(j + "\t\t");
            }
            
            System.out.println();
        }
    }
    
    void pattern02() {
        for (int i = 1; i <= 5; i += 1) {
            
            for (int k = 5; k > i; k -= 1) {
                System.out.print("\t");
            }
            
            for (int j = 1; j <= i; j += 1) {
                System.out.print("#" + "\t\t");
            }
            
            System.out.println();
        }
    }
    
    void pattern03() {
        int a = 1;
        
        for (int i = 1; i <= 5; i += 1) {
            
            for (int k = 5; k > i; k -= 1) {
                System.out.print("\t");
            }
            
            for (int j = 1; j <= i; j += 1) {
                System.out.print(a++ + "\t\t");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Triangle03 ob = new Triangle03();
        
        ob.pattern01();
        
        System.out.println("\n\n");
        
        ob.pattern02();
        
        System.out.println("\n\n");
        
        ob.pattern03();
    }
}
