import java.util.Scanner;
public class Add_two_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        int b1 = sc.nextInt();
        System.out.print("Enter second binary number: ");
        int b2 = sc.nextInt();

        int carry = 0;
        int result = 0;
        int place = 1;

        while (b1 != 0 || b2 != 0 || carry != 0) {

            int bit1 = b1 % 10;
            int bit2 = b2 % 10;

            int sum = bit1 + bit2 + carry;
            int bit = sum % 2;
            carry = sum / 2;
            result = result + (bit * place);
            place = place * 10;

            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        System.out.println("Sum of binary numbers: " + result);
    }
}