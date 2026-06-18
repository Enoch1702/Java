import java.util.Scanner;
public class sumof2matrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array (row and column) : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        System.out.println("Enter the array elements A matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Element - "+i+" : ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the array elements B matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Element - "+i+" : ");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum Two Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+b[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}