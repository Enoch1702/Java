import java.util.Scanner;
public class armstrongnum{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int r=num;
        int n=num,c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        int sum=0;
        while(num!=0){
            int ld=num%10;
            int ans=1;
            for(int i=1;i<=c;i++){
                ans*=ld;
            }
            sum+=ans;
            num/=10;
        }
        if(sum==r){
            System.out.print("Armstrong Number ");

        }
        else{
            System.out.print("Not a Armstrong Number ");
        }
    }
}