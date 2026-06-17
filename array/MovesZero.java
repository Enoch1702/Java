import java.util.Scanner;
public class MovesZero{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                result[index]=arr[i];
                index++;
            }
        }
        
        for(int k=0;k<n;k++){
            System.out.print(result[k]+" ");
        }
    }
}