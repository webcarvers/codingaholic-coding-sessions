
/** 
 * 
 *                  1
 *              2   3
 *          4   5   6
 *      7   8   9   10
 * 11   12  13  14  15
 *      16  17  18  19
 *          20  21  22  
 *              23  24
 *                  25
 * 
 * 
 *                  #
 *              #   #
 *          #   #   #
 *      #   #   #   #
 * #    #   #   #   #
 *      #   #   #   #
 *          #   #   #
 *              #   #
 *                  #
 * 
 *
 * @author (Mayank Tripathi)
 * @version (06/01/2021)
 */

class Triangle02 {
    
    void pattern01() {
        int a = 1;
        
        for (int i = 1; i <= 5; i += 1) {
            
            for (int k = 5; k > i; k -= 1) {
                System.out.print("\t");
            }
            
            for (int j = 1; j <= i; j += 1) {
                System.out.print(a + "\t");
                
                a += 1;
            }
            
            System.out.println();
        }
        
        for (int i1 = 4; i1 >= 1; i1 -= 1) {
            
            for (int k1 = 5; k1 > i1; k1 -= 1) {
                System.out.print("\t");
            }
            
            for (int j1 = 1; j1 <= i1; j1 += 1) {
                System.out.print(a + "\t");
                
                a += 1;
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
                System.out.print("#" + "\t");
            }
            
            System.out.println();
        }
        
        for (int i1 = 4; i1 >= 1; i1 -= 1) {
            
            for (int k1 = 5; k1 > i1; k1 -= 1) {
                System.out.print("\t");
            }
            
            for (int j1 = 1; j1 <= i1; j1 += 1) {
                System.out.print("#" + "\t");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Triangle02 ob = new Triangle02();
        
        ob.pattern01();
        ob.pattern02();
        
    }
    
}
