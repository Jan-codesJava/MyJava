package AccessModifiers;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

public class Animal {

    public String name;
    private String color;
    protected String gender;
    int age;


    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    private void eat(){
        System.out.println("Animal is eating");
    }

    protected void run(){
        System.out.println("Animal is running");
    }

    void swim(){  //default
        System.out.println("Animal is swimming");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.color ="orange";
        animal.eat();
        System.out.println(animal.color);
    }
}
