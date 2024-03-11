package InterfaceDemo;

public interface Interface {

    void fun();
    default void show(){
        System.out.println("Default show()");
    }
    static void stat(){
        System.out.println("Static stat()");
    }
}
