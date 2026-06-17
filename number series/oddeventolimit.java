import java.util.Scanner;
public class oddeventolimit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit : " );
        int limit=sc.nextInt();
        System.out.print("EVen numbers : ");
        for(int i=0;i<=limit;i+=2){
            System.out.print(i+" ");
        }
        System.out.print("\nOdd numbers : ");
        for(int j=1;j<=limit;j+=2){
            System.out.print(j +" ");
        }

    }
}