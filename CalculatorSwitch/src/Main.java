import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double value1;
        double value2;
        double result;
        char opCode;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first value");
        value1 = scan.nextDouble();
        System.out.println("Please enter second value");
        value2 = scan.nextDouble();
        System.out.println("Please enter operation type");
        opCode = scan.next().charAt(0);

        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : -999.0d; // ternary if statement
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(result);
    }
}