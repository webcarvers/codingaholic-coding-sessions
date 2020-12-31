class Patterns {
    
    /**
     * 1
     * 1    2
     * 1    2   3
     * 1    2   3   4
     * 1    2   3   4   5
     */
    void pattern01() {
       for (int i = 1; i <= 5; i += 1) {
            
            for (int j = 1; j <= i; j += 1) {
                System.out.print(j + "\t");
            }
            
            System.out.println();
        } 
    }
    
    /**
     * 1
     * 2    1
     * 3    2   1
     * 4    3   2   1
     * 5    4   3   2   1
     */
    void pattern02() {
        for (int i = 1; i <= 5; i += 1) {
            
            for (int j = i; j >= 1; j -= 1) {
                System.out.print(j + "\t");
            }
            
            System.out.println();
            
        }
    }
    
    /**
     * 1    2   3   4   5
     * 1    2   3   4
     * 1    2   3
     * 1    2
     * 1
     */
    void pattern03() {
        for(int i = 5; i >= 1; i -= 1) {
            
            for (int j = 1; j <= i; j += 1) {
                System.out.print(j + "\t");
            }
            
            System.out.println();
            
        }
    }
    
    /**
     * 5    4   3   2   1
     * 5    4   3   2
     * 5    4   3
     * 5    4
     * 5
     */
    void pattern04() {
        for (int i = 1; i <= 5; i += 1) {
        
            for (int j = 5; j >= i; j -= 1) {
                System.out.print(j + "\t");
            }
            
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        
        Patterns ob = new Patterns();
        
        // ob.pattern01();
        // ob.pattern02();
        // ob.pattern03();
        ob.pattern04();
    }
    
}
