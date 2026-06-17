import java.util.Scanner;
public class rotateright{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int result[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate right:");
        int k1=sc.nextInt();
        k1=k1%n;
        for(int i=0;i<n;i++){
            result[i]=arr[(i-k1+n)%n];
        }
        System.out.println("Array after right rotation:");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}