import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double gallons = 0;
        double mpg = 0;
        double gPrice = 0;
        double hundred;
        double distance;

        System.out.print("How many gallons of gas can your car hold: ");

        if(in.hasNextDouble())
        {
            gallons = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a proper input");
        }
        System.out.print("How many miles do you get per Gallon: ");
        if (in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a proper input");
        }

        System.out.print("How much do you pay for a gallon of gas: ");

        if (in.hasNextDouble())
        {
            gPrice = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a proper input");
        }

        hundred = ((100/mpg) * gPrice);
        System.out.println("It would cost $" + hundred + " to drive 100 miles");

        distance = gallons * mpg;
        System.out.println("You can drive " + distance + " more miles until you need gas!");
    }
}