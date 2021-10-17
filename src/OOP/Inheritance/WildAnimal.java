package OOP.Inheritance;

public class WildAnimal extends Animal{

    String name="Croc";
    String color;
    int age;

    public void eat(){

        System.out.println("Wild Animal is eating");
    }

    public int sleep(){
        System.out.println("Wild Animal is sleeping");
        return 5;
    }

    public void run(){

        System.out.println("Wild Animal is running");
    }

}
