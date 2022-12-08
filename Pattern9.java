
/**
 * Pattern7
 */

import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("* ");

            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--)
                System.out.print("  ");

            for (int k = 2 * i - 1; k > 0; k--)
                System.out.print("* ");

            System.out.println();
        }
    }
}