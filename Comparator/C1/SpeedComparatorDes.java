import java.util.Comparator;

public class SpeedComparatorDes implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.speed-o1.speed;
    }
}
