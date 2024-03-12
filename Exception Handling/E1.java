public class E1 {
    void divide(){
        int a=10,b=0;
        try {
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.out.println("e: "+e);
            System.out.println("e.getMessgae(): "+e.getMessage());
            e.printStackTrace();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("finally");
        }
        System.out.println("Outside");

    }

//    void fun(){
//        String s=null;
//        System.out.println(s.length());
//    }
}
