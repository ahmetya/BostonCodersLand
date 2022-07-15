public class Main {
    public static void main(String[] args) {

        int number = 0;

        int[] simpleArray = new int[100];
        double[] simpleDoubleArray = new double[10];
        float[] simpleFloatArray = new float[3];

        System.out.println(simpleArray.length);

        int age[] = {12, 4, 5, 2, 5};
        System.out.println(age[0]);

        int newAge[] = new int[5];

        newAge[0] = 12;
        newAge[1] = 4;
        newAge[2] = 5;
        newAge[3] = 2;
        newAge[4] = 5;
        // newAge[5] = 16; >> java.lang.ArrayIndexOutOfBoundsException

        System.out.println("First element: " + newAge[0]);
        System.out.println("Second element: " + newAge[1]);
        System.out.println("Third element: " + newAge[2]);
        System.out.println("Fourth element: " + newAge[3]);
        System.out.println("Fifth element: " + newAge[4]);

        System.out.println("########################");
        System.out.println("Using regular for loop: ");

        for (int i=0; i < age.length; i++){
            System.out.println(age[i]);
        }

        System.out.println("########################");
        System.out.println("Using for each loop: ");

        for(int a : age){
            System.out.println(a);
        }

        // Compute sum and average of Array Elements

        int numbers[] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average = 0.0d;
        for(int num : numbers){
            sum += num;
        }
        System.out.println("Total: " + sum);
        average = (double) sum / (double) numbers.length;
        System.out.println("Average: " + average);
    }




}