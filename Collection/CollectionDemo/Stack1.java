package CollectionDemo;

import java.util.Stack;

public class Stack1 {
    public void fun(){
        Stack<String> stack=new Stack();
         stack.push("abc");
         stack.push("def");
         stack.push("ghi");

        System.out.println("\n\nStack: "+stack);

         Iterable<String> iterable = stack;

         for(String str: iterable)
             System.out.println(str);

    }
}
