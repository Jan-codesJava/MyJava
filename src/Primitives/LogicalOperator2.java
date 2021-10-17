package Primitives;

public class LogicalOperator2 {
    public static void main(String[] args) {


        //There is an event for kids
        // they must be 5 or older than 5, 12 or younger than 12
        // the other req is their height needs to be 46 or more than 46"
        // to be able to attend


        int kidsAge = 2;
        int kidHeight = 46;

        int minAge = 5;
        int maxAge = 12;
        int reqHeight = 46;

        boolean ok = (kidsAge >=minAge && kidsAge <=maxAge) && kidHeight>= reqHeight;

        System.out.println(ok);
    }
}
