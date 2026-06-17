import java.util.Scanner;
public class absdiff{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even+=arr[i];   
            }
            else{
                odd+=arr[i];
            }
        }
        if(odd>even){
            System.out.println("The absolute difference is:"+(odd-even));
        }
        else{
            System.out.println("The absolute difference is:"+(even-odd));
        }
    }
}