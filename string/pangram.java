import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        String str1=str.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            for(int i=0;i<str.length();i++){
                char ch1=str1.charAt(i);
                if(ch==ch1){
                    count++;
                    break;
                }
            }
        }
        if(count==26){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not Panagram");

        }
    }
}
