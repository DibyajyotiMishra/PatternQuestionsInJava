import java.util.Scanner;

/**
 * Pattern14
 */
public class Pattern22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        int k = 2 * n - 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");
            }
            System.out.println();
        }
    }
}