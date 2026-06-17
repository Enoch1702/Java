import java.util.Scanner;
public class occurencestr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            int c=1,flag=0;
            char ch=str.charAt(i);
            for(int j=0;j<i;j++){
                if(ch==str.charAt(j) && ch!=' '){
                    flag++;
                }
            }
            if(flag==0){
                for(int k=i+1;k<str.length();k++){
                    if(ch==str.charAt(k) && ch!=' '){
                        c++;
                    }
                }
                if(ch!=' '){
                    System.out.println(ch+" occurs "+c+" times");
                }
                
            }
        }
    }
}