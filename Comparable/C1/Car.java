

public class Car implements Comparable<Car> {
    int speed;
    int power;
    public Car(int speed, int power){
        this.power=power;
        this.speed=speed;
    }

    public String toString(){
        return ("Car{ speed: "+speed+" power: "+power+" }");
    }

    @Override
    public int compareTo(Car o) {
        return o.speed-this.speed;
    }
}
