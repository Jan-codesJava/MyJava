package Loops;

import javax.crypto.spec.PSource;

public class ForLoop2 {
    public static void main(String[] args) {

        //print out the letters from a given String Value
        //Chicago
        //print out the letters starting from end of the string

        String word = "Chicago";

        for (int i = 0; i <= word.length() - 1; i++)

            System.out.println(word.charAt(i));

        System.out.println("***************************");

        for (int index = word.length() - 1; index >= 0; index--) {

            System.out.println(word.charAt(index));
        }
        System.out.println("************");

        //print out only letter 'o' from this String

        //count the amount of letter 'o's
        String string = "Today is the day to practice for loop";


        // k++
        int count = 0;
        for (int k = 0; k < string.length(); k++) {

            if (string.charAt(k) == 'o') {
                System.out.println(string.charAt(k));
                System.out.println("The index number of o is " + k);
                count++;


                System.out.println("the index number of  " + count + ". 'o' is " + k);
            }
        }



            //string.charAt(0); //T == o
            //      string.charAt(1); //o == o ==> sout(string.charAt(1)
            //   string.charAt(2);


        // "the index number of o is" ... (show index number of each letter 'o')

        System.out.println("count is "+count);
        }
    }

