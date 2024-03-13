package GenericsDemo;

public class Box2<T> {
    public T container;

    public Box2(T container){
        this.container=container;
    }

    public T getContainer(){
        return container;
    }
}
