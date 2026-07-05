public class visual_represent{
    public static void main(String[] args) {
        System.out.println("Visual Representation :");
        String str="a1b2c3d4";
        String result="";
        char a[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            a[i]=str.charAt(i);
        }
        for (int i = 0;i < a.length; i++) {
            if(a[i]>='a'&&a[i]<='z'){
                result+=a[i]+" ";
            }
            else{
                result += (char)(a[i-1]+(a[i]-'0')) +" ";
            }
        }
        System.out.println(result);
    }
}