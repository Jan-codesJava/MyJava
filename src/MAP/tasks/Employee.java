package MAP.tasks;

import java.util.HashMap;
import java.util.Random;


    /*create an employee class with instance variables of name, city, age, id
    -create one constructor to initialize instance variables
    - create a method to generate random 6 digit employee id nad use id for employee
    - create employeeTest class
    -create 4 employee object and store them in a map
    - while storing employees in the map, use their ids
    - create a method to print only employee names from map
    -print all employee ids from map
     */



public class Employee {

    String name;
    String city;
    long id;
    int age;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.id = generateId();
        this.age = age;
    }


    public static long generateId(){
        Random random = new Random();
        long newId =0;
        int digit;
        for (int i = 0; i < 6; i++) {
            digit=random.nextInt(10);
            newId+=digit;
            newId*=10;
        }
        return newId;
    }

    public static void main(String[] args) {
        System.out.println(generateId());
    }
}

