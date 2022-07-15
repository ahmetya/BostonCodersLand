public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte myByte = 1;
        int myInteger = 120;
        byte sumValues;
        sumValues = (byte) (myInteger + myByte);
        // System.out.println(sumValues);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntegerVal = 7;
        float myFloatVal = 5f;
        double myDoubleVal = 5d;

        myIntegerVal = myIntegerVal / 2;
        myFloatVal = myFloatVal /2;
        myDoubleVal = myDoubleVal /2;

        System.out.println(myIntegerVal);
        System.out.println(myFloatVal);
        System.out.println(myDoubleVal);

        double numberOfPounds = 20d;
        double convertedKilograms = numberOfPounds * 0.45349237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

        char myChar = 'p';
        System.out.println(myChar);

        char myUnicodeChar = '\u00A9';
        System.out.println(myUnicodeChar);
        System.out.println("I " + '\u2764' + " U");

        boolean myFalseBooleanValue = false;
        boolean myTrueBooleanValue = true;

        boolean flag = true;

        System.out.println(myFalseBooleanValue);
        System.out.println(myTrueBooleanValue);


        // byte
        // short
        // int
        // long

        // float
        // double

        //char
        //boolean


        //STRINGS

        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + " now longer" + "\u2345";
        System.out.println(myString);
        String myValueString = "10";
        int myValueInt = 5;
        double myDoubleNextVal = 102.5d;
        String myNewString = myValueString + myValueInt;
        System.out.println(myValueString + myValueInt);
        System.out.println(myNewString);
        System.out.println(myDoubleNextVal + myValueString);

        String myCase = "CASE";
        myCase = myCase.toLowerCase();
        System.out.println(myCase);

    }
}