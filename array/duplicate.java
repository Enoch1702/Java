import java.util.Scanner;
public class duplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements in the array are:");
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag++;
                    break;
                }
            }
        
        if(flag==0){
            for(int k=i+1;k<n;k++){
                if(arr[i]==arr[k]){
                    System.out.print(arr[k]+" ");
                    break;
                }
            
        }
        }
        }
        System.out.println("\nAfter removing duplicate elements in the array:");
        int flag=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("No duplicate elements in the array.");
        }

    }
}