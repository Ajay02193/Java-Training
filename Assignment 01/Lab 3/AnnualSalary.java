import java.util.Scanner;

public class AnnualSalary {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Id: ");
        int id=scn.nextInt();
        scn.nextLine();
        System.out.println("Name: ");
        String name=scn.nextLine();
        System.out.println("Salary: ");
        double salary=scn.nextDouble();

        Employee emp= new Employee(id,name,salary);

        double annualSalary=emp.calculateAnnualSalary();

        System.out.println("Annual Salary: "+annualSalary);
    }
}
