public class Area {
    public void area(){
        System.out.println("Area Of Shapes");
    }
    public void area(int s){
        System.out.println("Area Of Square: "+s*s);
    }
    public void area(int l,int b){
        System.out.println("Area Of Rectangle: "+l*b);
    }
    public void area(float r){
        System.out.println("Area Of Circle: "+3.14*r*r);
    }
    public void area(double b,int h){
        System.out.println("Area Of Triangle: "+0.5*b*h);
    }
}
