import java.util.Scanner;
public class mintohr{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the minutes : " );
        int min=sc.nextInt();
        if(min>=60){
            int hour=min/60;
            int minutes=min%60;
            System.out.print(hour+" hrs " +minutes+" mins");
        }
        else{
            System.out.print("Entered the value is less than 60.");
        }

    }
}