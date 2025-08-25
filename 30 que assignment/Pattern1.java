class Pattern1 {
    public static void main(String[] args) {
        int n = 5;

        //upper
        for(int i = 1; i<=n; i++) {
            for (int j = 0; j<i; j++) {
                if (j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print("*" + i);
                }
            }
            System.out.println();
        }

        //lower
        for(int i=n-1; i>=1; i--) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print("*"+ i);
                }
            }
            System.out.println();
        }
    }
}