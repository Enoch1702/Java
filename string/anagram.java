import java.util.Scanner;
public class anagram{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int a[]=new int[254];
        if(s.length()!=s1.length()){
            System.out.print("Not a Anagram");
            return;
        }
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
            a[s1.charAt(i)]--;
        }
        int f=0;
        for(int i=0;i<254;i++){
            if(a[i]!=0){
                f=1;
                break;
            }

        }
        if(f==1){
            System.out.print("Not a Anagram");

        }
        else{
            System.out.print("Anagram");
        }
    
    
    }
}