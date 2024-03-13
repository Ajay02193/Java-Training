package InterfaceDemo;

public class BiCycle implements Vehicle{

    int gear,speedU;
    @Override
    public void gearChange(int gear) {
        this.gear=gear;
    }
    @Override
    public void speedUp(int new_speed){
        speedU+=new_speed;
    }

    @Override
    public void printState() {
        System.out.println("Current Bicycle State - Speed: "+speedU+" Gear: "+gear);
    }
    @Override
    public String toString(){
        return "toString() BiCycle";
    }
}
