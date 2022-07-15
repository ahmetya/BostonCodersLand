public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2; // 3
        result = result - 1 ; // 2
        result = result * 10; // 20
        result =  result / 5; // 4

        //modulus
        result = result % 3; // 1

        result++; // 1 + 1 (result = result + 1;) >> 2
        result--; // 1 - 1 (result = result - 1;) >> 1

        result += 2; // result = result + 2;
        result *= 10; // result = result * 10;
        result /= 5;  // result = result / 5;
        result -= 2; // result = result - 2;

        System.out.println(result);
    }
}