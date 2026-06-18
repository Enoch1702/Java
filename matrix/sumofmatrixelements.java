import java.util.Scanner;
public class sumofmatrixelements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array (row and column) : ");
        int size=sc.nextInt();
        int a[][]=new int[size][size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("Element - "+i+""+j+" : ");
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
             sum=sum+a[i][j];
            }
        }   
        System.out.print(sum);
    }
}
