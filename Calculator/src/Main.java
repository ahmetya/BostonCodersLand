import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double value1;
        double value2;
        double result;
        char opCode;

        result = 0.0d;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter operation type");
        opCode = scan.next().charAt(0);
        System.out.println("Please enter first value");
        value1 = scan.nextDouble();
        System.out.println("Please enter second value");
        value2 = scan.nextDouble();

        if (opCode == 'a') {
            result = value1 + value2;
        } else if (opCode == 's') {

            result = value1 - value2;
        } else if (opCode == 'd') {
            result = value1 / value2;
        } else if (opCode == 'm') {
            result = value1 * value2;
        }
        System.out.println(result);
    }
}