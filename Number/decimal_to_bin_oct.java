import java.util.Scanner;
public class decimal_to_bin_oct
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // decimal
        int base = 8;           // change to 8 or 16
        int[] rem = new int[32];
        int idx = 0;

        while (n > 0) {
            rem[idx] = n % base;
            n = n / base;
            idx++;
        }
        // print from last remainder to first
        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(rem[i]);   // for base 2 and 8
        }
    }
}