import java.util.Scanner;

public class TwoIntegerToCal {

    public static void main(String[] args) {

        Scanner myObj1 = new Scanner(System.in);

        System.out.print("Enter the FirstNumber ");
        long num1 = myObj1.nextInt();

        Scanner myObj2 = new Scanner(System.in);

        System.out.print("Enter the SecondNUmber ");
        long num2 = myObj2.nextInt();

        double Add = num1 + num2;
        System.out.print("Addition of two number is "+Add);

        double mul = num1 * num2;
        System.out.print("Multiplication of two number is "+mul);

        float div = num1 / num2;
        System.out.print("Division  of two number is "+div);

        float average = (float) (num1 + num2) /2;
        System.out.print("Average  of two number is "+div);







    }
}
