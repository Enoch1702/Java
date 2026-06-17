import java.util.Scanner;
public class halfreverse{
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
        int end=(size/2)-1;
        while(start<end){
            int t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++;
            end--;
        }
        int start1=(size/2);
        int end1=size-1;
        while(start1<end1){
            int t1=a[start1];
            a[start1]=a[end1];
            a[end1]=t1;
            start1++;
            end--;
        }
        System.out.print("Reverse of the array : ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
