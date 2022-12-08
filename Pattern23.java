import java.util.Scanner;

/**
 * pattern23
 */
public class Pattern23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        char ch = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ((ch + n - 1) - j) + " ");
            }
            System.out.println();
        }
    }
}