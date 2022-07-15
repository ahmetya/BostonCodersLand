public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("Yes i'm an alien");
        } else {
            System.out.println("No i'm not an alien");
        }

        int yourScore = 50;
        if (yourScore > 80  ){
            System.out.println("You got the high score");
        } else if (yourScore > 60){
            System.out.println("You are mediocre");
        } else if ( yourScore < 40) {
            System.out.println("You are bad");
        } else {
            System.out.println("non above");
        }

        boolean isBMW = false;
        if ( isBMW != true){
            System.out.println("This is not a real car");
        }

        boolean myValue = true;

        if(myValue){
            System.out.println("you are OK");
        }

        boolean youAreGreat = false;
        int myScore = 100;

        if (myScore == 100){
            youAreGreat = true;
        }
        if (youAreGreat){
            System.out.println("YOU ARE GREAT !!!");
        }
        int topScore = 100;
        int secondTopScore = 60;

        // && means AND
        // || means OR

        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less then 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both conditions are true");
        }

    }
}