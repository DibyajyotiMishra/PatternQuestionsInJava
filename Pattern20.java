import java.util.Scanner;

/**
 * Pattern14
 */
public class Pattern20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print("  ");

            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            for (int j = 2 * (n - i); j >= 1; j--)
                System.out.print("  ");
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}