import java.util.Scanner;
public class kthrev{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        System.out.print(s.charAt(k));
        for(int i=k-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        for(int j=k+1;j<s.length();j++){
            System.out.print(s.charAt(j));
        }
    }
}