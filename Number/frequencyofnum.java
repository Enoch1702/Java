import java.util.Scanner;
public class frequencyofnum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        for(int digit=0;digit<=9;digit++){
            int count=0;
            int temp=n;
            while(temp>0){
                int last=temp%10;
                if(last==digit){
                    count++;
                }
                temp=temp/10;
            }
            if(count>0){
                System.out.println(digit+"--"+count);
            }
        }
    }
}