package Constructor;

public class CupTest {
    public static void main(String[] args) {

        Cup c1 = new Cup(21, true, 8);

        System.out.println(c1.isClean);
        System.out.println(c1.liquidAmount);

        Cup c2 = new Cup();
        System.out.println(c2.liquidAmount);

        System.out.println(c1); //hashcode
        System.out.println(c2); //hashcode
        c1.info();
        c2.info();

        Cup c3 = new Cup(16, true, 12);

        System.out.println(c3);

        c1 = null;

        Cup c4 = c1;

        System.out.println(c1);
        System.out.println(c4);


        Cup c5 = new Cup(22, false);
        Cup c6 = new Cup(16, true, 12);

        c5 = null;
        c6 = null;
        System.gc(); //garbage collector used at the end of code


    }

}
