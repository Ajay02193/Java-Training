public class EmployeeNameInvalidException extends Exception{
    EmployeeNameInvalidException(){
        System.out.println("The Employee name cannot be empty.");
    }
}
