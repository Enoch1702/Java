import java.util.*;

public class compare2str
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() != str2.length())
        {
            System.out.println("Not Equal");
            return;
        }

        int flag = 0;

        for(int i=0;i<str1.length();i++)
        {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if(ch1>='A' && ch1<='Z')
            {
                ch1 = (char)(ch1 + 32);
            }

            if(ch2>='A' && ch2<='Z')
            {
                ch2 = (char)(ch2 + 32);
            }

            if(ch1 != ch2)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}