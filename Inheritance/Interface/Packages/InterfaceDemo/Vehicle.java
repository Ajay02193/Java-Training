package InterfaceDemo;

public interface Vehicle {
    void speedUp(int s);
    void gearChange(int g);
    void printState();
    default void Default(){
        System.out.println("Default");
    }
}
