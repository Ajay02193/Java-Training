/*Write a Java program that demonstrates method overriding by creating a superclass called Animal
and two subclasses called Dog and Cat.
● The Animal class should have a method called makeSound(),which simply prints "The animal makes a sound."
● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively.
● The program should allow the user to create and display objects of each class.
[Hint:Use multilevel inheritance]*/


public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.makeSound();
        c.makeSound();
    }
}
