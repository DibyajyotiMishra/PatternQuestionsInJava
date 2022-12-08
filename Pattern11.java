import java.util.Scanner;

/**
 * Pattern11
 */
public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(((i + j) % 2) + " ");
            }
            System.out.println();
        }
    }
}