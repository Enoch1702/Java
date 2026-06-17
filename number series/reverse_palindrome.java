import java.util.Scanner;
public class reverse_palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int num=n;
        int rev=0,digit;
        while(num!=0){
            digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }
        System.out.println("Reverse of the number : "+rev);
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}