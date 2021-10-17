package Primitives;

public class CastingPractice {
    public static void main(String[] args) {

        long l1 = 120;

        // int i1 =l1; larger data type can not be stored in smaller data type

        int i2 = (int)l1; //explicit casting (Auto narrowing)

        double db1 = l1;  //implicit casting (Autp widening)

        short apple = 800;
        short samsung = 600;

        short total = (short)(apple+samsung);
        System.out.println(total);

        byte total1 = (byte) (apple+samsung);

        System.out.println("total1 --> "+total1);


        //====================

        byte a = 12;
        short b =a;

        //=========================

        int total2 = apple+samsung;

    }
}
