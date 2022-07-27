import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("fist number is bigger: " + firstNumber);

        } else if (firstNumber < secondNumber){
            System.out.println("second number is bigger: " + secondNumber);

        } else {
            System.out.println("they are equal...");
        }
    }
}