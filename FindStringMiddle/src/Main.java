public class Main {

    public static void findMiddle (String word){

        String[] wordArray = word.split("");

        if(wordArray.length % 2 == 1){
            System.out.println(wordArray[wordArray.length/2]);
        }else {
            System.out.println(wordArray[(wordArray.length/2) - 1] + wordArray[wordArray.length / 2]);
        }
    }
    public static void main(String[] args) {
        findMiddle("hello");
        findMiddle("member");
    }
}