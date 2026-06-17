import java.util.Scanner;

public class diffdiagonal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = sc.nextInt();
        int a[][] = new int[size][size];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int p = 0;
        int s = 0;
        for(int i=0;i<size;i++)
        {
            p = p + a[i][i];
            s = s + a[i][size-1-i];
        }
        int d = p - s;
        if(d < 0)
        {
            System.out.println(-d);
        }
        else
        {
            System.out.println(d);
        }
    }
}