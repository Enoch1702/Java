import java.util.Scanner;
public class countoddevendigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ; ");
        int n=sc.nextInt();
        int e=0,o=0;
        while(n!=0){
            int ld=n%10;
            if(ld%2==0){
                e++;
            }
            else{
                o++;
            }
            n=n/10;
        }
        System.out.print("\nEven count : "+e+"\nOdd count : "+o);
    }
}