package Loops;

public class StarPractice {
    public static void main(String[] args) {

        // 5 ==>
        // *
        // **
        // ***
        // ****
        // *****

        int number = 5;
        String stars = "*";

        while (number > 0) {
            number--;
            System.out.println(stars);
            stars += "*";

        }
    }
}