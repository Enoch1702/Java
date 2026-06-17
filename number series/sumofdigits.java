import java.util.Scanner;
public class sumofdigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int sum=0,digit;
        while(n!=0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("Sum of all digits : "+sum);
    }
}