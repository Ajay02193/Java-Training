import java.util.Comparator;

public class PowerComparatorDes implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o2.power-o1.power;
    }
}
