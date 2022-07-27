import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input an integer: ");
        int digits = in.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public  static int sumDigits(int n){
        int result = 0;
        while (n > 0){
            int digit = n % 10;
            result = digit + result;
            n = n / 10;
        }
        return  result;
    }
}