/*Unchecked Exceptions*/
import ExceptionDemo.UAgeException;

public class Main2 {
    public static void main(String[] args) {
        int age=17;
        if(age<18)
            throw new UAgeException();
        else
            System.out.println("Eligible");
    }
}
