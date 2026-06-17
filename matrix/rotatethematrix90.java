import java.util.Scanner;
public class rotatethematrix90
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
        for(int j=0;j<size;j++)
        {
            for(int i=size-1;i>=0;i--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}