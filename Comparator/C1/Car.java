

public class Car {
    int speed;
    int power;
    String name;
    public Car(int speed, int power, String name){
        this.power=power;
        this.speed=speed;
        this.name=name;
    }

    public String toString(){
        return ("Car{ speed: "+speed+" | power: "+power+" | name: "+name+" }");
    }

}
