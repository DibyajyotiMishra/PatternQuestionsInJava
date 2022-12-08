import java.util.Scanner;

/**
 * Pattern14
 */
public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        char ch = 'A';

        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j < n; j++) {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
        }
    }
}