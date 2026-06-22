import java.util.Scanner;
public class star_pattern_boundary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        //int n = sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0||i==r-1||j==0||j==c-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}