public class E1 {
    void fun(){
        int a=10,b=0;
        try {
            System.out.println(b/a);
            throw new RuntimeException();
            //System.out.println(a / b);
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

//        String s=null;
//        System.out.println(s.length());               //NullPointerException
    }
}
