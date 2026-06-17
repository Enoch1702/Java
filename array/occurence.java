import java.util.Scanner;
public class occurence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=1,flag=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag++;
                }
            }
            if(flag==0){
                for(int k=i+1;k<n;k++){
                    if(arr[i]==arr[k]){
                        c++;
                    }
                }
                System.out.println(arr[i]+" occurs "+c+" times");
            }
        }
    }
}