import java.util.Scanner;
public class railwaytime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in 12-hour format (HH:MM/AM/PM): ");
        String time12 = sc.nextLine();
        char h1,h2,p1,p2,m1,m2;
        h1=time12.charAt(0);
        h2=time12.charAt(1);
        int hour = (h1-'0')*10+(h2-'0');
        p1=time12.charAt(5);
        p2=time12.charAt(6);
        if(hour!=12 && p1=='P' && p2=='M'){
            hour+=12;
        }
        if(hour==12 && p1=='A' && p2=='M'){
            hour=0;
        }
        m1=time12.charAt(3);
        m2=time12.charAt(4);
        if(hour<10){
            System.out.print("Time in 24-hour format: 0"+hour+":"+m1+m2);
        }
        else{
            System.out.print("Time in 24-hour format: "+hour+":"+m1+m2);
        }
        
    }
}