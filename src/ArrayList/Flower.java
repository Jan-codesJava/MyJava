package ArrayList;

import java.util.ArrayList;

public class Flower {

    String color;
    String name;
    int numberOfPetals;
    double price;

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", price=" + price +
                '}';
    }

    public Flower(String color, String name, int numberOfPetals, double price) {
        this.color = color;
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;

    }

//create few flower objects and store them in an arraylist

    public static double price(ArrayList<Flower> flowers){
        double total = 0;
        for(int i = 0; i< flowers.size(); i++){

            total += flowers.get(i).price;

        }
        return total;
    }



    public static void main(String[] args) {
        ArrayList <Flower> flowers = new ArrayList();


        Flower fl1 = new Flower("red", "Rose", 12, 3.99);
        Flower fl2 = new Flower("yellow", "Rose", 10, 2.99);
        Flower fl3 = new Flower("pink", "Rose", 11, 3.86);
        Flower fl4 = new Flower("violet", "Rose", 13, 4.99);

flowers.add(fl1);
flowers.add(fl2);
flowers.add(fl3);
flowers.add(fl4);


        System.out.println(flowers);
        System.out.println(flowers.get(2).price);

        System.out.println(fl3.price);
        System.out.println(price(flowers));

        //create a method that will take an arraylist as a parameter
        //this method will return total prices of the flowers



        ArrayList <String> names = new ArrayList();
    names.add("Alex");
}
}
