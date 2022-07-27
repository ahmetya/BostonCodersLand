import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String word = scanner.nextLine();
        String reverseWord = "";
        System.out.println("length of the word: " + word.length());
        for(int i = word.length()-1; i >= 0; i-- ){
            reverseWord = reverseWord + word.charAt(i);
        }
        System.out.println(reverseWord);
    }
}
