package Constructor;

public class Employee {

    String name;
    int age;
    int employeeId;
    String gender;
    String companyName = "Techtorial";

    public int setEmployeeId(int id){
        employeeId = id;
        return employeeId;
    }

    public void Info(){
        System.out.println(name + age + employeeId+gender+ companyName);
    }

    public Employee(){ } //constructor

    public Employee(String newGender){
        gender = newGender;
    }
}
