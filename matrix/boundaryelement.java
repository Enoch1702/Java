import java.util.Scanner;
public class boundaryelement
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array (row and column) : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the array elements A matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Element - "+i+""+j+" : ");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            System.out.print(a[0][i]);
        }
        for(int i=1;i<r;i++){
            System.out.print(a[i][c-1]);
        }
        for(int i=r-1;i<c;i++){
            System.out.print(a[i][i]);
        }
    }
}
