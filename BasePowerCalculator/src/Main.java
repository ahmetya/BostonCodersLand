import java.util.Scanner;
import  java.lang.Math;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        // Two numbers entered through keyboard
        // Write a program to find the value of one number raised to the power of another.

        int base;
        int power;
        int result = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base number ");
        base = scan.nextInt();
        System.out.println("Enter the power number ");
        power = scan.nextInt();

        for(int i =  1; i <= power; i++){
            result *= base;
        }
        System.out.println("Result: " + result);

        // Same thing without for loop...
        int total = (int) Math.pow(base, power);
        System.out.println("Quick total: " + total);
    }
}