package Switch;

public class Practice2 {
    public static void main(String[] args) {

        String name = "Zack";

        switch (name){
            default:
                System.out.println("Student is not here");
            case "Alex":
                System.out.println("Alex is here");
                break;
            case "David":
                System.out.println("David is here");
                break;
            case "Luna":
                    System.out.println("Luna is here");
                    break;
        }
    }
}
