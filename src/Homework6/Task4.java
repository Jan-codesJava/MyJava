package Homework6;

public class Task4 {
    public static void main(String[] args) {

        /*
        Given a string, if a length 2 substring appears at both its beginning and end,
         print a string without the substring at the beginning, so "HelloHe" yields "lloHe".
         The substring may overlap with itself, so "Hi" yields "". Otherwise, print the original string unchanged.
Example:
"TestTe" --> print stTe
"TestTi" --> print TestTi
         */

        String str = "TestTe";

        String part1 = str.substring(2);
        System.out.println(part1);

        String part2 = str.substring(0, 6);
        System.out.println(part2);


    }
}
