public class TaxNotEligibleException extends Exception{
    TaxNotEligibleException(){
        System.out.println("The Employee does not need to pay tax.");
    }
}
