import java.util.Scanner;
public class primedigitsinanumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("Prime digits in a number : ");
        while(n!=0){
            int digit=n%10;
            if(digit==2 || digit==3 || digit==5 || digit==7){
                System.out.print(digit+" ");
            }
            n/=10;
        }
    }
}