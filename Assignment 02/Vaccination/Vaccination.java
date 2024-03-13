/* Create abstract class vaccine.Create two variables age(int),nationality(String).
create 2 concrete methods firstDose() and secondDose().
Scenario 1:user can take the first dose if the user is Indian and age is 18.
After vaccination the user has to pay 250rs(which will be displayed on the console).
Scenario 2: Users are eligible to take the second dose only after completing the first dose.
Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation
class vaccinationSuccessful, where implement boosterDose() method.
Create main class vaccination and invoke all methods accordingly.
[Hint:Create constructor to initialize variables age and nationality,Use flow control(Ifelse) to check
condition] Sample Input Nationality: Indian Age: 18 */



public class Vaccination {
    public static void main(String[] args) {
        VaccinationSuccessful vs = new VaccinationSuccessful();
        System.out.println("First Dose:");
        int r=vs.firstDose(19,"Indian");
        if(r!=0){
            System.out.println("Second Dose:");
            r=vs.secondDose();
        }
        if (r!=0){
            System.out.println("Booster Dose:");
            vs.boosterDose();
        }
        else
            System.out.println("You are not eligible for vaccination");
    }
}
