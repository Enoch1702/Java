import java.util.Scanner;
public class pal{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        
        if(s.equalsIgnoreCase(rev)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("not a Palindrome");
        }

    }
}