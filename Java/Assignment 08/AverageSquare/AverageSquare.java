public class AverageSquare {
    public static void main(String[] args) {

        AverageThread averageThread = new AverageThread();
        SquareThread squareThread = new SquareThread();

        squareThread.start();
        try {
            squareThread.join(); // Wait for SquareThread to finish
        } catch (Exception e) {
            e.getMessage();
        }
        averageThread.start();
    }
}
