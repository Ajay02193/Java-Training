public class TaxCalculator {
    double calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
        if(!isIndian){
            throw new CountryNotValidException();
        }

        if(empName==null || empName.isEmpty()){
            throw new EmployeeNameInvalidException();
        }

        if(empSal>=100000)
            return empSal*8/100;
        else if(empSal<100000&&empSal>50000)
            return empSal*6/100;
        else if(empSal<50000&&empSal>30000)
            return empSal*5/100;
        else if(empSal<30000&&empSal>10000)
            return empSal*4/100;
        else
            throw new TaxNotEligibleException();

    }
}
