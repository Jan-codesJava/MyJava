package Homework1;

public class Task1 {
    public static void main(String[] args) {

        double minutes = 3456789;
        double hours = (minutes/60);
        System.out.println(hours);
        double days = (hours/24);
        System.out.println(days);
        double years = (days/365);

        double day_sRemainder = (576 * 365);

        System.out.println("The output is approximately " + years +
                ".  6.576843607305936 is 6 years and " + day_sRemainder + " days");

    }
}
