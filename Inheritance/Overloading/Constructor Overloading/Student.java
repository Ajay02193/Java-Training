public class Student {

    String name;
    int age;
    String email;
    float marks;

    Student(String name){
        this.name=name;
    }
    Student(String name,int age){
        this.age=age;
        this.name=name;
    }

    Student(int age, String name,String email){
        this.age=age;
        this.name=name;
        this.email=email;
    }

    Student(int age,String name,String email,float marks){
        this.age=age;
        this.name=name;
        this.email=email;
        this.marks=marks;
    }
}
