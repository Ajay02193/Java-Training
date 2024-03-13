package CollectionDemo;

import java.util.Stack;

public class Stack1 {
    public void fun(){
        Stack<String> stack=new Stack();
        Boolean r=stack.empty();
         stack.push("abc");
         stack.push("def");
         stack.push("ghi");

        System.out.println("\n\nStack: "+stack);
        stack.pop();
        System.out.println("Stack:"+stack);
        r=stack.empty();
        System.out.println("stack.empty: "+r);

         Iterable<String> iterable = stack;

         for(String str: iterable)
             System.out.println(str);

    }
}
