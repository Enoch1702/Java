import java.util.Scanner;
public class spiralmatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];

        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int num=1;

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
                a[top][i]=num++;
            top++;

            for(int i=top;i<=bottom;i++)
                a[i][right]=num++;
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    a[bottom][i]=num++;
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                    a[i][left]=num++;
                left++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}