import java.util.Scanner;

public class Company implements Client{
    Scanner scn=new Scanner(System.in);
    String name;
    String salary;
    public void input(){
        System.out.println("Name: ");
        name=scn.nextLine();
        System.out.println("Salary: ");
        salary=scn.nextLine();

    }
    public void output(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);

    }

}
