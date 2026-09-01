import java.util.Scanner;
public class OddorEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int ln = num.length() - 1;

        char ld = num.charAt(ln);

        if (ld == '1' || ld == '3' || ld == '5' || ld == '7' || ld == '9') {
            System.out.println("The number is Odd");
        } else {
            System.out.println("The number is Even");
        }
    }
}