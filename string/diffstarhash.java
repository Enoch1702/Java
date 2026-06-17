import java.util.Scanner;
public class diffstarhash{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int star=0;
        int hash=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                star++;
            }
            else if(s.charAt(i)=='#'){
                hash++;
            }
            else{
                System.out.println("Invalid Input");
                return;
            }
        }
        System.out.println(star-hash);
    }
}