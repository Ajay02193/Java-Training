package ExceptionDemo;


//compile-time exceptions --- for checked exception
public class AgeException extends Exception  /*Checked Exception*/  /*RuntimeException -- Unchecked Exception Cases*/  {

    public AgeException(){
        super("under age");
    }
}
