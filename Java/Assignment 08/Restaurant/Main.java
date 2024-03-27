public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Thread customerThread = new Thread(() -> restaurant.foodOrder("Pizza"));
        Thread cookThread = new Thread(() -> restaurant.cookedOrder("Pizza"));
        Thread waiterThread = new Thread(() -> restaurant.servedOrder("Pizza"));

        customerThread.start();
        cookThread.start();
        waiterThread.start();
    }
}
