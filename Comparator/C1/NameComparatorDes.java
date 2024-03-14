import java.util.Comparator;

public class NameComparatorDes implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.name.compareTo(o1.name);
    }
}
