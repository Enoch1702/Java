import java.util.Scanner;
public class LCMandGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.print(gcd + " " + lcm);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}