import java.util.Scanner;

public class InchesToMeter {

    public static void main(String[] args) {

        //Get the Value from the User in inches
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the inches:");
        float inches = myObj.nextInt();

        //Conversion of inches to meter
        double meter = inches * 0.0254;
        System.out.println("The meters for the provided inches:"+meter);

    }
}
