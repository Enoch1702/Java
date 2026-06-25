import java.util.Scanner;
public class Zig_Zag_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j % 4 == 3) ||
                    (i == 2 && j % 2 == 0) ||
                    (i == 3 && j % 4 == 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}