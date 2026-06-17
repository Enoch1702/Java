import java.util.Scanner;
public class insertword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        int pos = sc.nextInt();
        System.out.println("Using StrigBuilder");
        StringBuilder sb = new StringBuilder(str);
        sb.insert(pos, word);
        System.out.println(sb.toString());
        System.out.println("Without Using StringBuilder");
        for(int i=0;i<str.length();i++){
            if(i==pos){
                System.out.print(word);
            }
            System.out.print(str.charAt(i));
        }
    }
}