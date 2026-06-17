import java.util.Scanner;
public class bubblesort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }

        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}