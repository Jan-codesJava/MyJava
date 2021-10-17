package Primitives;

public class BooleanPractice {
    public static void main(String[] args) {


        boolean isLightOn = true;

        boolean isBreakTime;

        isBreakTime=isLightOn;

        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        int num=6;
        System.out.println(num);

        int num1=num;
        System.out.println(num1);


        boolean isClear=false;

        System.out.println(isClear);
        //System.out.println(isBreakTime+isClear);// it will not compile
        System.out.println("!!!!!"+isBreakTime+isClear);

        boolean bl = true; //work/yes/on/open
        boolean bl2 = false; //not working, off, no, closed ..
        //boolean bl3 = "yes";

        int i1 = 5;
        int i2 = 5;
        int i3 =10;

        //boolean isi1EqualsToi2 = i1 = i2;



    }
}