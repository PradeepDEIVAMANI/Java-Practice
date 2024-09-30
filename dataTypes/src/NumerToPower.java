import java.util.Scanner;

public class NumerToPower {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the Numbers between 1 to 1000:");
        int num = myObj.nextInt();

        double square = num*num;

        double cube = num*num*num;

        double fourth = Math.pow(num, 4);

        System.out.println("value of square; "+square);

        System.out.println("value of square; "+cube);

        System.out.println("value of square; "+fourth);



    }
}
