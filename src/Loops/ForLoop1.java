package Loops;

public class ForLoop1 {
    public static void main(String[] args) {


        for (int number = 0; number < 5; number++) {

            System.out.println("It is for LOOP" + number);

        }

        int number = 1;
        for (; number < 5; number++) {

            System.out.println("It is second for LOOP" + number);

        }

        for ( ; number < 10;  ) {

            number++;
            System.out.println("It is THIRD for LOOP"+number);
        }
        for ( ; number<15 ;  ) {

            number++;
            System.out.println("It is FOURTH for LOOP"+number);
        }

    }
}