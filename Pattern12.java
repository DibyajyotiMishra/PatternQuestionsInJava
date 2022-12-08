import java.util.Scanner;

/**
 * Pattern12
 */
public class Pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            // L ----> R
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            for (int k = 1; k <= (n - i) * 4; k++)
                System.out.print(" ");

            // R ----> L
            for (int j = i; j > 0; j--)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}