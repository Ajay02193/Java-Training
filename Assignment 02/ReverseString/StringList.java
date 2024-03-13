import java.util.ArrayList;
import java.util.List;

public class StringList {
    void fun(){
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println("Original list: "+list);
        reversefun(list);
        System.out.println("Reverse list: "+list);
    }
    void reversefun(List<String> list){
        int l=0,r=list.size()-1;
        while(l<r){
            String temp=list.get(l);
            list.set(l,list.get(r));
            list.set(r,temp);
            l++;r--;
        }
    }
}
