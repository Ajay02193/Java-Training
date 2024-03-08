public class rec {
    void print(int a){
        System.out.println(a);
        a++;
        if(a<=10)
            print(a);
    }
    public static void main(String[] args) {
        int a=1;
        rec r =new rec();
        r.print(a);
    }
}
