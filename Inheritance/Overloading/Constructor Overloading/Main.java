public class Main {
    public static void main(){
        System.out.println("main method overloaded");
    }
    public static void main(String[] args) {
        /*new A();
        new A(001);
        new A("AJAY");
        new A(001,"AJAY");*/

        Main.main();   //main method overloaded and invoked

        Student s1=new Student("AJAY");
        Student s2=new Student("AJAY",24);
        Student s3=new Student(24,"AJAY","a@m.com");
        Student s4=new Student(24,"AJAY","a@m.com",25);

        System.out.println("NAME: "+s1.name);
        System.out.println(s1);

        System.out.println("NAME: "+s2.name+" AGE: "+s2.age);
        System.out.println(s2);

        System.out.println("NAME: "+s3.name+" AGE: "+s3.age+" EMAIL: "+s3.email);
        System.out.println(s3);

        System.out.println("NAME: "+s4.name+" AGE: "+s4.age+" EMAIL: "+s4.email+" MARKS: "+s4.marks);
        System.out.println(s4);
    }
}
