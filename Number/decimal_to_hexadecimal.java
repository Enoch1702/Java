import java.util.Scanner;
public class decimal_to_hexadecimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // decimal
        int base = 16;           // change to 8 or 16
        int[] rem = new int[32];
        int idx = 0;

        while (n > 0) {
            rem[idx] = n % base;
            n = n / base;
            idx++;
        }
        // print from last remainder to first
        for (int i = idx - 1; i >= 0; i--) {
            int r = rem[i];
            if (r < 10) {
                System.out.print(r);
            } else {
                char ch = (char)('A' + (r - 10));  // 10→A, 11→B, ...
                System.out.print(ch);
            }
        }
    }
}