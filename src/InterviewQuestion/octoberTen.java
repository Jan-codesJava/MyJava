package InterviewQuestion;

public class octoberTen {
    public static void main(String[] args) {

        String name = "Ahmet";
        String name1 = new String("Ahmet");
        String name2 = "Ahmet";
        String name3 = new String("Ahmet");
// == it compares the location of the value(String pool)
        System.out.println(name==name2); //true
        //.equals it only checks the value of the variable
        System.out.println(name.equals(name2)); //true
        System.out.println(name== name1);//false
        System.out.println(name.equals(name1)); //true
        System.out.println(name1==name3);//false   //location
        System.out.println(name1.equals(name3)); //true  //value


//String Builder / String Buffer
        String example = "Mehmet";
        example.concat("loves Java");
        StringBuilder example2 = new StringBuilder("Mehmet");
        example2.append("loves java");
        System.out.println(example); //Mehmet
        System.out.println(example2);  //Mehmet loves Java

       // Mutable & immutable

        //Difference between string Builder and Buffer:
        // The main difference is ALL about synchronization / thread safe **
        // Could you tell me what you mean synchronization / thread safe?
        //In my mind it means first come first serve
        //it waits for the perform (action one by one)
       //String buffer is synchronize and slow and thread safe
        //String Builder is not synchronized. It is fast and not thread safe
        //Hashtable is also synchronized


        /*
         // How can you limit the creating of the object from your class
         /*  I make the class abstract
         //* I make the constructor private
         */

    }
}
