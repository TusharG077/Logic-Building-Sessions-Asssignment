class Pattern8 {
    public static void main(String[] args) {
        int n=6;

       
        for(int j=0; j<6; j++) {
            System.out.print("*");
        }
        System.out.println();

        
        for(int i=0; i< n-2; i++) {
            System.out.print("*");
            for (int j = 0; j < 4; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

      
        for(int j=0; j< 6; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}