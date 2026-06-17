import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i==0) {
                System.out.print(Character.toUpperCase(ch));
            } else if (str.charAt(i-1) == ' ') {
                System.out.print(Character.toUpperCase(ch));
            } else {
                System.out.print(ch);
            }
        }
    }
}