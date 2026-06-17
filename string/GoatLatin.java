import java.util.Scanner;
public class GoatLatin{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine()+" ";
        int pos=1;
        String word="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                char ch1=word.charAt(0);

                if(ch1=='a' || ch1=='A' || ch1=='E' || ch1=='e' || ch1=='i' || ch1=='I' || ch1=='o' || ch1=='O' || ch1=='u' || ch1=='U'){
                    System.out.print(word+"m");

                }
                else{
                    for(int j=1;j<word.length();j++){
                        System.out.print(word.charAt(j));
                    }
                    System.out.print(ch1+"m");
                }
                for(int k=1;k<=pos;k++){
                    System.out.print("a");
                }
                if(i!=str.length()){
                    System.out.print(" ");
                }
                pos++;
                word="";
            }
            else{
                word+=ch;
            }
            
        } 
    }
}