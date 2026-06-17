import java.util.Scanner;
public class sumofN{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int limit =sc.nextInt();
        int sum=0;
        for (int i=1;i<=limit;i++){
            sum+=i;
        }
        System.out.print("Sum of all Natural Numbers to the limit is "+sum);
    }
}