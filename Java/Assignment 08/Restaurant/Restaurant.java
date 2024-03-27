public class Restaurant {
    private boolean orderReceived = false;
    private String currentOrder;

    public synchronized void foodOrder(String orderName) {
        if (orderReceived) {
            try {
                wait(); // Wait for previous order to be cooked
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        currentOrder = orderName;
        orderReceived = true;
        System.out.println("Customer placed order: " + orderName);
        notifyAll(); // Notify the cook that an order has been placed
    }

    public synchronized void cookedOrder(String orderName) {
        while (!orderReceived || !currentOrder.equals(orderName)) {
            try {
                wait(); // Wait until an order is received
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Chef has received the order. Cooking is under process for: " + orderName);
        try {
            Thread.sleep(1); // Simulate cooking time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chef has finished cooking: " + orderName);
        orderReceived = false;
        notifyAll(); // Notify the waiter that the order is ready
    }

    public synchronized void servedOrder(String orderName) {
        while (!orderReceived || !currentOrder.equals(orderName)) {
            try {
                wait(); // Wait until an order is received
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Waiter serving order: " + orderName);
        orderReceived = false;
        notifyAll(); // Notify the customer that the order has been served
    }
}
