//145 is a strong number becoz(1!+4!+5!=145)
import java.util.Scanner;
public class Strongnumcheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int sum=0;
        int num=n;
        while(num!=0){
            int digit=num%10;
            int fact=1;
            while(digit!=0){
                fact=fact*digit;
                digit--;
            }
            sum+=fact;
            num/=10;
        }
        if(sum==n){
            System.out.println("Strong number");

        }
        else{
            System.out.print("Not a Strong Number");
        }
    }
}