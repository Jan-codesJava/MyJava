package Loops;

public class ForLoop4 {
    public static void main(String[] args) {
        //String str = "aB*12345&Id";
        //count and print out how many letter are there in the string
        //count and print out how many numbers are there in the string
        //count and print out how many other chars are there in the string
        //"There are 3 letters in the String"
        //"There are 3 numbers in the String"
        // There are 4 other chars in the String

        String str = "aB*12345&Id";
        str = str.toLowerCase();
        int letterCounter = 0;
        int numberCounter = 0;
        int charCounter = 0;

        for (int index = 0; index < str.length(); index++) {

            if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
                letterCounter++;
            }
            if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {

                numberCounter++;
            } else {

                charCounter++;
            }
        }

        System.out.println("There are" + letterCounter + "letters in the string");
        System.out.println("There are" + numberCounter + "numbers in the string");
        System.out.println("There are" + charCounter + "other symbols in the string");
    }

    }

