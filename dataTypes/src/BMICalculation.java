import java.util.Scanner;

public class BMICalculation {


    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the body weight in pounds:");
        float weight = myObj.nextInt();

        double weigthInKg =  (weight/2.2);

        System.out.println("Enter your height in cm:");
        float height = myObj.nextInt();

        double heightInInches = height * 2.54;

        double BMIcalculation = ( weigthInKg / (heightInInches*heightInInches)*10000);

        System.out.println("The BMI of your body is" +BMIcalculation);

    }

}
