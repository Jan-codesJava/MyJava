package Constructor;

import javax.sound.sampled.Line;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Zack";
        employee1.age = 25;
        employee1.setEmployeeId(11);
        System.out.println(employee1.employeeId);

Employee employee2 = new Employee("female");
        System.out.println(employee2.gender);

        System.out.println(employee1); // hashcode- location in memory


        employee1.Info();
        employee2.Info();
    }
}
