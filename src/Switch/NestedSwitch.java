package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        you are making call to a company
        there are three departments IT-1, HR-2, REP-3
        In the IT department: Raj, Alex, Jessi
        In the HR dept: Ana, Tima
        In the REP dept: Jeremiah, John, David

        *ask user "which department they want to talk to?"
        after they choose the department;
        ask them "who do they want to talk with?"
        Print --> "...is on the line"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("which department they want to talk to? 1-IT 2-HR 3-REP");
        int departmentNumber = scanner.nextInt();
        switch (departmentNumber){
            case 1: //IT dept
                scanner = new Scanner(System.in);
                System.out.println("who do they want to talk with? Raj, Alex, Jessi");
                String name = scanner.nextLine().toLowerCase();

                switch (name.toLowerCase()) {
                    case "raj":
                        System.out.println("Transferring to Raj");
                        break;

                    case "alex":
                        System.out.println("Transferring to Alex");
                        break;
                    case "jessi":
                        System.out.println("Transferring to Jessi");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;

            case 2:
                scanner = new Scanner(System.in);
                System.out.println("Who do you want to talk with? Ana, Tima");
                String hrName = scanner.nextLine().toLowerCase();
                switch (hrName){
                    case "ana":
                        System.out.println("Transferring to Ana");
                        break;
                    case "tima":
                        System.out.println("Transferring to Tima");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                break;

            case 3:
                scanner = new Scanner(System.in);
                System.out.println("Who do you want to talk with? Jeremiah, John, David");
                String repName = scanner.nextLine().toUpperCase();
                switch (repName){
                    case "Jeremiah":
                        System.out.println("Transferring to Jeremiah");
                        break;
                    case"John":
                        System.out.println("Transferring to JOhn");
                        break;
                    case "David":
                        System.out.println("Transferring to David");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;

                }
                break;
            default:
                System.out.println("Invalid selection for department");
                break;
        }

    }
}
