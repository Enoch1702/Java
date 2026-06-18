import java.util.Scanner;
public class findkeyinmatrix {
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
        System.out.print("Enter the key element :");
        int key=sc.nextInt();
        String id="NO";
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(a[i][j]==key){
                    id="YES";
                    break;
                }
            }
        }   
        System.out.print(id);
    }
}
