package Object;

public class AnimalTest {

    public static void main(String[] args) {

      Animal cat = new Animal();

      System.out.println(cat.name);

      cat.name = "Tom";
        System.out.println(cat.name);

        cat.age = 5;
        cat.weight = 8.5;
        cat.legNumber = 4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);

        //create a dog object and initialize each variable and print them out.

        Animal dog = new Animal();
        dog.name = "Max";
        System.out.println(dog.name);

//instance variables/ object

        dog.age = 4;
        dog.weight = 7;
        dog.legNumber = 4;

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.weight);
        System.out.println(dog.legNumber);

        Animal bird = new Animal();

      System.out.println(bird.weight);

      cat.run(" West");
      dog.run(" West");

      System.out.println("*********************");

      cat.sleep();
      dog.sleep();
      bird.sleep();

      cat.printInfo();
      bird.printInfo();
      bird.legNumber=2;
      bird.printInfo();
      dog.printInfo();

      System.out.println("==================");
      cat.printInfo();
      cat.energy=100;
      cat.printInfo();
      cat.run(" Up");
      cat.printInfo();
      cat.run(" South");
      cat.run(" Down Stairs");
      cat.printInfo();
      cat.sleep();
      cat.printInfo();

      //========================

      bird.energy=100;
      bird.sleep();
      bird.run(" in to air");
    }
}
