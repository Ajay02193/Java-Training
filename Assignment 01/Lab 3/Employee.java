public class Employee extends User{
    double salary;

    Employee(int id, String name, double salary) {
        super(id, name);
        this.salary=salary;
    }

    double calculateAnnualSalary(){

        return salary*12;
    }
}
