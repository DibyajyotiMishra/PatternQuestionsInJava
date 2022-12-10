import java.util.Scanner;

/**
 * Pattern24
 */
public class Pattern24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        int space = 2 * rows - 1;
        int num = 1;
        for (int i = 1; i <= space; i++) {
            for (int j = 1; j <= space; j++) {
                if (i == j || j == space - i + 1)
                    System.out.print(num + " ");
                else
                    System.out.print("  ");

            }
            System.out.println();
            if (i < 5)
                num++;
            else
                num--;
        }
    }
}