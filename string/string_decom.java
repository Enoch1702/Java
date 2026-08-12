public class string_decom{
    public static void main(String args[]){
    String str="a2k3a4bc3";
    for (int i = 0; i < str.length(); i += 2) {
        char ch = str.charAt(i);
        int count = str.charAt(i + 1) - '0';

        for (int j = 0; j < count; j++) {
            System.out.print(ch);
        }
    }

    }
}    
