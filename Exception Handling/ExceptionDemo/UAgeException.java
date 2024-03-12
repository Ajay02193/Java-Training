package ExceptionDemo;


//run-time exceptions --- for unchecked exception
public class UAgeException extends /*Exception -- Checked Exception*/  RuntimeException /*Unchecked Exception Cases*/  {

    public UAgeException(){
        super("under age");
    }
}