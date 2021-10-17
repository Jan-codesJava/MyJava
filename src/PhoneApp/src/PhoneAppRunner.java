import java.util.Scanner;

public class PhoneAppRunner {

    // in here instantiate the Phone object

    public static void main(String[] args) {
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        Implement the logic for passcode.
        You need to first ask the user passcode of the phone
        if the user input is not same with phone.passCode then the user
        should not be able to open the phone and see the below options
         */

        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
        System.out.println("Thank you for working with us");
    }
    private static void makeAChoice(String choice) {
        Scanner input = new Scanner(System.in);
        switch (choice) {

            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                printOptions();
                break;
        }


    }

    public static void welcome() {

        System.out.println("Welcome to the Phone Application");
    }

    public static void printOptions() {

        System.out.println("Hello. Please choose on of the following options");
        System.out.println("1 - For new Contact");
        System.out.println("2 - To print all Contacts' Full Name  and Phone Number");
        System.out.println("3 - Update Contact Phone number");
        System.out.println("4 - Find Person information with Phone Number");
        System.out.println("5 - Find Phone number with Contact Name");
        System.out.println("6 - Update City information for Contact");
        System.out.println("7 - Update Email address information for Contact");
        System.out.println("0 - To exit");
    }
}
