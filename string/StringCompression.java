import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decompressed string: ");
        String str = sc.nextLine();
        System.out.print("Compressed string: ");
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i)==str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i) + "" + count);
                count=1;
            }
        }
        System.out.print(str.charAt(str.length() - 1) + "" + count);
    }
}