import java.util.Scanner;
public class binarytonum{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary value : ");
        int n=sc.nextInt();
        int decimal=0;
        int base=1;
        while(n>0){
            int ld=n%10;
            decimal=decimal+(ld*base);
            base*=2;
            n=n/10;
        }
        System.out.print("Decimal value : "+decimal);
    }
}
        