import java.util.Scanner;
public class lastdigiteven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int ld=n%10;
        if(ld%2==0){
            System.out.print("Last digit is even ");
        }
        else{
            System.out.print("Last digit is not even");
        }
    }
}