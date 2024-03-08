public class Rectangle extends Shape{
    double length,width;
    Rectangle(String color,double length,double width){
        //super(color);
        this.color=color;
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }

    String tostring(){
        return "Rectangle color is "+super.getColor()+" Area is "+area();
    }
}
