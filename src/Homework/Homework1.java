package Homework;

public class Homework1 {
    public static void main(String[] args) {

        //Task1

        double minutes = 3456789;
        double hours = (minutes/60);
        System.out.println(hours);
        double days = (hours/24);
        System.out.println(days);
        double years = (days/365);

        double day_sRemainder = (576 * 365);

        System.out.println("The output is approximately " + years +
                ".  6.576843607305936 is 6 years and " + day_sRemainder + " days");




        //Task2

        int weightInPounds= 452;
        int heightInInches= 72;
        int BMI = (weightInPounds/(heightInInches*heightInInches));
        System.out.println (" Body Mass Index is " + BMI );



        //Task3


        //Task4

        double Fahrenheit = 212;
        double Celsius = (Fahrenheit-32)/1.8;
        System.out.println(Fahrenheit+" F = " +Celsius + " Celsius");

        //Task5



    }
}
