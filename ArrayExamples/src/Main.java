public class Main {
    public static void main(String[] args) {

        /*
        Write Java statements that do the following:
        a) Declare an array numArray of 15 elements of type int.
        b) Output the value of the tenth element of the array alpha.
        c) Set the value of the fifth element of the array alpha to 35.
        d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
        */

        // a
        int[] numArray = new int[15];
        //b
        int[] alphaArray = new int[100];
        System.out.println(alphaArray[9]);
        //c
        alphaArray[4] = 35;
        //d
        alphaArray[8] = alphaArray[5] + alphaArray[12];

        /*
        Question 2
            a) Write a statement that declares a string array initialized with the following strings:
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
            b) Write a loop that displays the contents of each element in the array that you declared.
        */

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(String day : days){
            System.out.println(day);
        }

        System.out.println("#######################");

        for(int i = 0; i<days.length; i++){
            System.out.println(days[i]);
        }

    }
}