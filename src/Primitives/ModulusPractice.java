package Primitives;

public class ModulusPractice {
    public static void main(String[] args) {

        //arithmetic operators are +, -, *, / , % (modulus)
        // % (modulus will give the reminder of division)

        int studentCount = 9;
        int divisor = 2;

        int resultOfDivision;

        resultOfDivision = studentCount/divisor;
        System.out.println("The result is --> "+resultOfDivision);

        int remainder = studentCount % divisor;
        System.out.println("The remainder is --> "+ remainder);

        double remainder1 = studentCount % divisor;
        System.out.println(remainder1);
    }
}

// % modulus --> finds remainder
//int x = 15;  i want to divide 15 by 6 and find the remainder--->3
//int result = x % 6;
//system.out.println(result);


