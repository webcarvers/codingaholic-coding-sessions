
/**
 *                  01
 *              02  03  04
 *          05  06  07  08  09
 *      10  11  12  13  14  15  16
 * 17   18  19  20  21  22  23  24  25
 *      26  27  28  29  30  31  32
 *          33  34  35  36  37
 *              38  39  40
 *                  41
 * 
 *          
 *                  #
 *              #   #   #
 *          #   #   #   #   #
 *      #   #   #   #   #   #   #
 * #    #   #   #   #   #   #   #   #
 *      #   #   #   #   #   #   #
 *          #   #   #   #   #
 *              #   #   #
 *                  #
 * 
 *
 * @author (Mayank Tripathi)
 * @version (09/01/2021)
 */

class Diamond01 {
    
    void pattern01() {
        for (int i = 1; i <= 5; i += 1) {
            
            for (int k = 5; k > i; k -= 1) {
                System.out.print("\t");
            }
            
            for (int j = 1; j <= i; j += 1) {
                System.out.print(j + "\t");
            }
            
            for (int j1 = i -1; j1 >= 1; j1 -= 1) {
                System.out.print(j1 + "\t");
            }
            
            System.out.println();
        }
        
        for (int i1 = 4; i1 >= 1; i1 -= 1) {
            
            for (int k1 = 5; k1 > i1; k1 -= 1) {
                System.out.print("\t");
            }
            
            for (int j2 = 1; j2 <= i1; j2 += 1) {
                System.out.print(j2 + "\t");
            }
            
            for (int j3 = i1 -1; j3 >= 1; j3 -= 1) {
                System.out.print(j3 + "\t");
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
            
            for (int j1 = i -1; j1 >= 1; j1 -= 1) {
                System.out.print("#" + "\t");
            }
            
            System.out.println();
        }
        
        for (int i1 = 4; i1 >= 1; i1 -= 1) {
            
            for (int k1 = 5; k1 > i1; k1 -= 1) {
                System.out.print("\t");
            }
            
            for (int j2 = 1; j2 <= i1; j2 += 1) {
                System.out.print("#" + "\t");
            }
            
            for (int j3 = i1 -1; j3 >= 1; j3 -= 1) {
                System.out.print("#" + "\t");
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
                String toPrint = a < 10 ? "0" + a : a + "";
                
                System.out.print(toPrint + "\t");
                a += 1;
            }
            
            for (int j1 = i -1; j1 >= 1; j1 -= 1) {
                String toPrint = a < 10 ? "0" + a : a + "";
                
                System.out.print(toPrint + "\t");
                a += 1;
            }
            
            System.out.println();
        }
        
        for (int i1 = 4; i1 >= 1; i1 -= 1) {
            
            for (int k1 = 5; k1 > i1; k1 -= 1) {
                System.out.print("\t");
            }
            
            for (int j2 = 1; j2 <= i1; j2 += 1) {
                System.out.print(a + "\t");
                a += 1;
            }
            
            for (int j3 = i1 -1; j3 >= 1; j3 -= 1) {
                System.out.print(a + "\t");
                a += 1;
            }
            
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Diamond01 ob = new Diamond01();
        
        ob.pattern01();
        
        System.out.println("\n\n");
        
        ob.pattern02();
        
        System.out.println("\n\n");
        
        ob.pattern03();
    }
    
}
