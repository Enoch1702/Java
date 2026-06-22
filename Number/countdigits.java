import java.util.Scanner;
public class countdigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        System.out.print("The count of the digit present in the number is "+c);
    }
}