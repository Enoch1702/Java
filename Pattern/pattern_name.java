import java.util.Scanner;
public class pattern_name
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String str=sc.nextLine();
        int len =str.length();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(i==j){
                    System.out.print(str.charAt(i)+" ");
                }
                else if(i+j==len-1){
                    System.out.print(str.charAt(j)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}