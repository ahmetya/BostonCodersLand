import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Write a program that prompts the user to input a positive integer.
        // It should print the multiplication table o that number.

        Scanner scan = new Scanner(System.in);
        int num;
        int mult;

        System.out.println("Enter any positive integer: ");
        num = scan.nextInt();

        for (int i=1; i<=10; i++){
            mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
        }

        System.out.println("####################\n");
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }

        System.out.println("#################\n");

        // Write a program to find the factorial value of any number entered.
        int fact = 1;
        for (int i = 1; i <=num; i++){
            fact *= i; // fact = fact * i;
            System.out.println("Current value >> " + fact );
        }
        System.out.println("Factorial value = " + fact);
    }
}