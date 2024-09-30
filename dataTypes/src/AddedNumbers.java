import java.util.Scanner;

public class AddedNumbers {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the Numbers between 1 to 1000:");
        int numbers = myObj.nextInt();

        if (numbers < 0 || numbers > 1000) {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
        }
        else
        {
            int sum = 0;
            int temp = numbers;

            // Loop to calculate the sum of digits
            while (temp != 0) {
                sum += temp % 10;  // Add the last digit to the sum
                temp /= 10;

            }
            System.out.println("The sum of the digits of " + numbers + " is: " + sum);
        }
    }
}
