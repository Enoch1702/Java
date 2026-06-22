import java.util.Scanner;
public class numtooctal{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        String octal="";
        while(n>0){
            octal=(n%8)+octal;
            n=n/8;
        }
        System.out.println("Binary value : "+octal);

    }
}