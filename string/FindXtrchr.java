import java.util.Scanner;
public class FindXtrchr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            sum1+=s.charAt(i);
        }
        for(int j=0;j<s2.length();j++){
            sum2+=s2.charAt(j);
        }
        int diff;
        if(sum1>sum2){
            diff=sum1-sum2;
        }
        else{
            diff=sum2-sum1;
        }
        char r=(char)(diff);
        System.out.print(r);
    }
}
