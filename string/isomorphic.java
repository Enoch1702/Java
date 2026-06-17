import java.util.Scanner;
public class isomorphic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int m1[]=new int[254];
        int m2[]=new int[254];
        if(s.length()!=s1.length()){
            System.out.print("Not Isomorphic");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=s1.charAt(i);
            if(m1[ch1]==0 && m1[ch2]==0){
                m1[ch1]=ch2;
                m2[ch2]=ch1;
            }
            else if(m1[ch1]!=ch2 || m2[ch2]!=ch1){
                System.out.print("Not Isomorphic");
                break;
            }
            else{
                System.out.print("Isomorphic");
                break;
            }
        }
    }
}