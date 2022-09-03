package org.example;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Day");
        int day = scan.nextInt();
        System.out.println("Enter Month");
        int month = scan.nextInt();
        System.out.println("Enter Year");
        int year = scan.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, day);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")));
    }
}