import java.util.Scanner;
public class numtobinary{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        System.out.println("Binary value : "+binary);

    }
}