/*Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg.
Subclasses extend the superclass and override its location() and famousFor() method.
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class.
As it refers to the base class object and the base class method overrides the superclass method;
the base class method is invoked at runtime.
ii.call the location() and famousFor() method by the all subclass’,and print accordingly*/



public class Main {
    public static void main(String[] args) {
        Manali ml = new Manali();
        System.out.println("Manali");
        ml.location();ml.famousFor();
        Mussoorie mo = new Mussoorie();
        System.out.println("***\nMussoorie");
        mo.location();mo.famousFor();
        Gulmarg gm = new Gulmarg();
        System.out.println("***\nGulmarg");
        gm.location();gm.famousFor();
    }

}
