import java.util.Scanner;
public class rotateleft{
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
        System.out.print("Enter the number of positions to rotate:");
        int k=sc.nextInt();
        k=k%n;
        for(int i=0;i<n;i++){
            result[i]=arr[(i+k)%n];
        }
        System.out.println("Array after left rotation:");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }

    }
}