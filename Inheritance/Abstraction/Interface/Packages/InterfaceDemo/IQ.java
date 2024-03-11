package InterfaceDemo;

public interface IQ {
    int a=10;
    default void display(){
        System.out.println("Hello "+a);
    }
}


