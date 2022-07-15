public class Main {
    public static void main(String[] args) {

        int n = 10;
        while (n>1){
            System.out.println("Number: " + n);
            n--;
        }


        int i = 5;
        do {
            System.out.println("Do executed and value: " + i);
            i++;
        } while (i <= 10);

        while (i <= 100) {
            System.out.println("While executed.. " + i);
            i++;
            if (i == 15) {
                break;
            }
        }


    }
}