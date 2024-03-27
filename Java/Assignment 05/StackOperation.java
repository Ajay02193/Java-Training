import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int[] arr={23,33,43,53,103,63,73,83,93,13};
        for(int i: arr)
            stack.push(i);
        System.out.println("Stack elements: "+stack);
        for(int i=0;i<4;i++)
            stack.pop();
        System.out.println("Stack elements after pop: "+stack);
    }
}
