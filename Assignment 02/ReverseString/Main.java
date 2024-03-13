/*Write a program to reverse a given List of strings
original list = [apple, banana, cherry, date]
reversed list = [date, cherry, banana, apple]*/



public class Main {
    public static void main(String[] args) {
        StringList sl = new StringList();
        sl.fun();
    }
}


/* // Method to reverse a list of strings
    private static void reverseList(List<String> list) {
        int left = 0;
        int right = list.size() - 1;

        // Swap elements from start to end until left < right
        while (left < right) {
            // Swap elements at left and right indices
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move left index to the right
            left++;

            // Move right index to the left
            right--;
        }
    }*/