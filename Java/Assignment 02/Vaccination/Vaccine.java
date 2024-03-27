public abstract class Vaccine {
    int age;
    String nationality;
    public int firstDose(int age,String nationality){
        if(age>=18&&nationality=="Indian"){
            System.out.println("Rs 250 has to be paid.");
            System.out.println("First Dose given suuccessfully");
            return 1;
        }
        else
            return 0;
    }

    public int secondDose(){
        System.out.println("Second Dose given successfully");
        return 1;
    }

    abstract void boosterDose();


}
