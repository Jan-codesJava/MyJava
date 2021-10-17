package OOP.Inheritance3;

public class Mall {

    public static void main(String[] args) {


        Shirt shirt = new Shirt("L", 26);
        System.out.println(shirt.price);
        //shirt.color = "Red";  you ca not re - assign value for final variable

        TShirt tShirt = new TShirt();
       // tShirt.color = "Black";    you ca not re - assign value for final variable

        tShirt.COLOR = "orange";
        System.out.println(tShirt.COLOR);
        TShirt tShirt1 = new TShirt();
        System.out.println(tShirt.COLOR);

    }

}
