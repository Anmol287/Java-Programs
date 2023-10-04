import java.util.Scanner;

public class special {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size : ");

        int n = scan.nextInt();
        if (n > 10) {
            System.out.println("SIZE OUT OF RANGE");
            System.exit(0);
        }

        String m[][] = new String[n][n];

        System.out.print("First Character: ");
        String ch1 = scan.next();
        System.out.print("Second Character: ");
        String ch2 = scan.next();
        System.out.print("Third Character: ");
        String ch3 = scan.next();

        // for diagonal printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    m[i][j] = ch3;
                    System.out.print(m[i][j] + " ");
                } else if ((i + j) == (n - 1)) {
                    m[i][j] = ch3;
                    System.out.print(m[i][j] + " ");
                }

                // for
                else if (i > 0 && j == 0) {
                    m[i][j] = ch2;
                    System.out.print(m[i][j] + " ");
                } else if ((i > 0) && (j == n - 1)) {
                    m[i][j] = ch2;
                    System.out.print(m[i][j] + " ");
                }

                // for
                else if ((i == 0) && (j > 0)) {
                    m[i][j] = ch1;
                    System.out.print(m[i][j] + " ");
                } else if ((i == n - 1) && (j > 0)) {
                    m[i][j] = ch1;
                    System.out.print(m[i][j] + " ");
                }

            }
            System.out.println();
        }
        scan.close();
    }
}
