import java.util.Scanner;

public class prct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];

        System.out.println("Enter 4 names:");

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }

        scanner.close();

        System.out.println("\nPrinting names using a for-each loop:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
