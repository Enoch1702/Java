import java.util.Scanner;
public class greatpre {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pre=0;
        System.out.print(arr[pre]+" ");
        for(int i=1;i<n;i++){
            if(arr[i]>arr[pre]){
                System.out.print(arr[i]+" ");
                pre=i;
            }
        }
    }
}