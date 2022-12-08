import java.util.Scanner;

/**
 * Pattern14
 */
public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        char ch = 'A';

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + i) + " ");
            }
            System.out.println();
        }
    }
}