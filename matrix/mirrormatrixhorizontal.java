import java.util.Scanner;
public class mirrormatrixhorizontal
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
        for(int i=size-1;i>=0;i--)
        {
            for(int j=0;j<size;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }   
    }
}