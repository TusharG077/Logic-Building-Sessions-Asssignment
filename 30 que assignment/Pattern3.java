class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1; i<=n; i++) {
            int currentNum = 1;
            for (int j=1; j<= i; j++) {
                if (j>1) {
                    System.out.print("*" + currentNum);
                } else {
                    System.out.print(currentNum);
                }
                currentNum += 2;
            }
            System.out.println();
        }
    }
}