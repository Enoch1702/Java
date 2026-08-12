import java.util.Scanner;

public class LargestLuckyInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == a[i] && a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println(largest);
    }
}