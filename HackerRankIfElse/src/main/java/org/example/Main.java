package org.example;

import java.util.Scanner;

public class Main {
    public static void myScannerFunction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value");
        int value = scan.nextInt();
        if (value < 2) {
            System.out.println("Weird");
        } else if (value >= 2) {
            System.out.println("Not Weird");
        } else if (value >= 6) {

            System.out.println("Weird");
        } else if (value >= 20) {
            System.out.println("Not Weird");
        }
        System.out.println("Do you want to continue? y/n");
        char decision = scan.next().charAt(0);
        if (decision == 'y'){
            System.out.println("Decision" + decision);
            myScannerFunction();
        }
        else {
            scan.close();
        }
    }

    public static void main(String[] args) {
        myScannerFunction();
    }
}