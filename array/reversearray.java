import java.util.Scanner;
public class reversearray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int start=0;
        int end=size-1,t;
        while(start<end){
            t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++;
            end--;
        }
        System.out.print("Reverse of the array : ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}