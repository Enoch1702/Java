import java.util.Scanner;
public class twistedprimecheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int t=num,c=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                c++;
            }
        }
        if(c!=2){
            System.out.print("Not a Twisted prime number ");
        }
        else{
            int rev=0;
            while(t!=0){
                int ld=t%10;
                rev=(rev*10)+ld;
                t=t/10;
            }
            int c1=0;
            for(int j=1;j<=rev;j++){
                if(rev%j==0){
                    c1++;
                }
            }
            if(c==c1){
                System.out.print("Twisted Prime number ");
            }
            else{
                System.out.print("Not a Twisted Prime Number ");
            }

        }
    }
}