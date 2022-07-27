import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("First Number");
        double first = in.nextDouble();
        System.out.println("Second Number");
        double second = in.nextDouble();
        System.out.println("Third Number");
        double third = in.nextDouble();
        System.out.println("smallest is: " + smallest(first, second, third));
        // double smallest = smallest(first, second, third);
        System.out.println("average is: " + average(first, second, third));

    }

    public static double smallest(double x, double y, double z){
        // double smallestNumber = 0.0d;
        double smallestNumber = Math.min(Math.min(x,y),z);
        return smallestNumber;
    }

    public static double average(double x, double y, double z){
        return (x + y + z) / 3;
    }

}