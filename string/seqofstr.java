import java.util.Scanner;
public class seqofstr{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizBuz");

            }
            else if(i%3==0){
                System.out.println("Fiz");
            }
            else if(i%5==0){
                System.out.println("Buz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}