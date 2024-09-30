import java.util.Scanner;

public class MintuesToDays {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the Numbers between 1 to 1000:");
        int mintues = myObj.nextInt();

        // Number of minutes in a year
        int year = mintues / 525600;
        int day = mintues / 1440;
        int remainingMinutes = day % 525600;

        System.out.println(mintues + " minutes is " + year + " years and "  +  remainingMinutes + " days ");

    }
}
