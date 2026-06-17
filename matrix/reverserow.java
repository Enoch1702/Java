import java.util.Scanner;
public class reverserow {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array (row and column) : ");
        int size=sc.nextInt();
        int a[][]=new int[size][size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("Element - "+i+" : ");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
               
            }
        }
    }
}
