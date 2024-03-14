public class string {
    public static void main(String[] args) {
        String s1=new String("Arun");
        String s2=new String("Arun");
        String s3=s1;

        System.out.println("s1==s2: "+(s1==s2));      //reference check --false
        System.out.println("s1.equals(s2): "+s1.equals(s2));    //value check --true
        System.out.println("s1==s3: "+(s1==s3));      //reference check --true
        System.out.println("s2.equals(s3): "+s2.equals(s3));    //value check --true
    }
}
