import java.util.Scanner;

public class SpeedCalculation {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the distance in meters");
        int distance = myObj.nextInt();

        System.out.println("Enter the mintues");
        int mintues = myObj.nextInt();

        System.out.println("Enter the seconds:");
        int seconds = myObj.nextInt();


        float speed = distance /seconds;

        System.out.println("The speed flor the givenData is "+speed);



    }
}
