import java.util.Scanner;
public class matrixtranspose
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
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
             System.out.print(a[j][i]+" ");
            }
            System.out.println(" ");
        }   
    }
}