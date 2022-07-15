import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java program to find sum of positive numbers.
        int sum = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);

        // take integer input from the user.
        System.out.println("Enter a number !");
        number = input.nextInt();

        // add only positive numbers.
        while(number >= 0 ){
            sum += number; // sum = sum + number;
            System.out.println("Please enter next number");
            number = input.nextInt();
        }
        System.out.println("Sum: " + sum);
        input.close();
    }
}