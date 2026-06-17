import java.util.Scanner;
public class identicalmatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array (row and column) : ");
        int size=sc.nextInt();
        int a[][]=new int[size][size];
        int b[][]=new int[size][size];
        System.out.println("A Matrix Element : ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("B Matirx Element :");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int flag=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i][j]!= b[i][j]){
                    System.out.print("FALSE");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("TRUE");
        }
    }
}