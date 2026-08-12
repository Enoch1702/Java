public class string_letter{
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        String str="aakkkaaaabccc";
        int c=1;
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch==str.charAt(i+1)){
                c++;
            }
            else{
                System.out.print(ch+""+c);
                c=1;
            }
        }
        System.out.print(str.charAt(str.length() - 1) + "" + c);
    }
}