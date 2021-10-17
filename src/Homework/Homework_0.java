package Homework;

public class Homework_0 {
    public static void main(String[] args) {

        //Task1
        int myAge = 22;
        int myHeight = 168;
        int myWeight = 53;


        System.out.println (myAge);
        System.out.println(myHeight);
        System.out.println(myWeight);




        //Task2

        int age=56;
        int weight=65;
        double height=1.63;
        double BMI = (weight/(height*height));
        System.out.println("My BMI is " + BMI );


        //Task 2/1

        int massInKg = 53;
        double heightInMeters = 1.68;
        double BMI1 = (massInKg/heightInMeters*heightInMeters);
        System.out.println("BMI is " + BMI1 );




        //Task3

        int kg = 8;
        double pounds = (kg*2.205);
        double grams = (kg*1000);
        System.out.println(pounds+" pounds");
        System.out.println(grams+" grams");

        //Task4

        int meter = 6;
        double foot = ( meter * 3.281);
        double centimeter =(meter * 100);
        System.out.println("Foot is " + foot );
        System.out.println(centimeter+ " centimeter");

        //Task5

        double Fahrenheit = 212;
        double Celsius = (Fahrenheit-32)/1.8;
        System.out.println(Fahrenheit+" F = " +Celsius + " Celsius");



    }
}
