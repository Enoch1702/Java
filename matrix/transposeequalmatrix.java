import java.util.Scanner;
public class transposeequalmatrix
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
        int flag=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(a[i][j]!=a[j][i]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Matrix is equals to its Transpose");
        }
        else{
            System.out.println("Not Equal");
        }

    }
}