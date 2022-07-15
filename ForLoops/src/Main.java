public class Main {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World!! " + "i: " + i + " n: " + n);
        }

        // Program to print numbers from 1 to 5

        int k = 5;
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Print out numbers from 10 to 0 (i--)
        System.out.println("############################");
        int m = 10;
        for (m = 10; m >= 0; m--) {
            System.out.println(m);
        }

        System.out.println("##############################\n");

        // Programs to find the sum of natural numbers from 1 to 1000.
        // 500500
        int sum = 0;
        int target = 1000;
        // for loop

        for (i = target; i >= 1; --i) { // i = 1000
            sum += i; // sum = sum + i;
            // System.out.println("Sum: " + sum);
        }
        System.out.println("Sum = " + sum);
    }




}