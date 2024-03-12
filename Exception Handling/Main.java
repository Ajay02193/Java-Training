import ExceptionDemo.AgeException;

public class Main {
    public static void main(String[] args) {

        int age=17;
        try{
            if(age<18)
                throw new AgeException();
            else
                System.out.println("Eligible");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
