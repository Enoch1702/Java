import java.util.Scanner;
public class sumtillsingledigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        while(n>9){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit;
                n=n/10;
            }
            n=sum;
        }
        System.out.println("Sum till single digit sum value is : "+n);

    }
}