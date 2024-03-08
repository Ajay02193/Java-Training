public class Circle extends Shape{
    double radius;

   public  Circle(String color, double radius){
       //super.(color);
        this.color=color;
        this.radius=radius;
    }

    double area(){
        return 3.14*radius*radius;

    }

    String tostring(){
        return "Circle color is "+super.getColor()+" Area is "+area();

    }
}
