import java.util.Scanner;
public class powercalculation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base number  : ");
        int base=sc.nextInt();
        System.out.print("Enter power value : ");
        int pow=sc.nextInt();
        int ans=1;
        for(int i=1;i<=pow;i++){
            ans*=base;
        }
        System.out.print(base+"^"+pow+"="+ans);
    }
}
