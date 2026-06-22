import java.util.Scanner;

public class carBrand
{
    class car
    {
        String brand;
        int speed;

        void move()
        {
            if(speed > 0)
            {
                System.out.println(brand + " is moving at " + speed + " km/h");
            }
            else
            {
                System.out.println(brand + " is not moving.");
            }
        }
    }

    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);

        carBrand obj = new carBrand();
        car c = obj.new car();

        System.out.print("Enter Brand : ");
        c.brand = sc.nextLine();

        System.out.print("Enter Speed : ");
        c.speed = sc.nextInt();

        System.out.println("\nCar Status");
        c.move();
    }
}