import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        TaxCalculator taxCalculator= new TaxCalculator();

        System.out.println("Employee Name: ");
        String empName=scn.nextLine();

        System.out.println("Indian(y/n): ");
        char Indian=scn.next().charAt(0);
        boolean isIndian=(Indian=='y'||Indian=='Y');


        System.out.println("Salary: ");
        double empSal=scn.nextDouble();

        try{
            double tax = taxCalculator.calculateTax(empName,isIndian,empSal);
            System.out.println("Tax to pay: "+tax);
        }
        catch (Exception e){
        }
    }
}
