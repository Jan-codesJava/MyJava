package Methods;

import java.util.Random;

public class Student {

        /*
        Student class
        Create name, lastName and age field

        create sleep method this method will take one parameter for amount  of sleep
        create study method this method will take one parameter for amount of study
        create run method with will take one parameter for amount of run

        print >> ... is sleeping ... hours
                 ... is studying ... hours
                 ... is running ... hours
         */


        String name;
        String lastName;
        int age;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.lastName = "Hopper";
        student1.age = 36;
        student1.study();
        student1.sleep("in class");
        student1.run();
        //study();
     //   Student.study();

    }

        public void sleep(String place){
        int hour = generateHour();
            System.out.println(name+ " is sleeping "+ place + hour+ "  hours");
            study();
    }
    public void study (){
        System.out.println(name+ " is studying "+generateHour()+ " hours");
    }
    public void run(){
        System.out.println(name+ " is running "+generateHour()+ " hours");
    }

    //create a generateHour method to get random amount of hour and pass that hour to each of methods (sleep, study, run) above

    public int generateHour() {
        Random random = new Random();
        int hour = random.nextInt(8);

        return hour;

    }
}
