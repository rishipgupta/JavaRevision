package inheritance;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "Blue";
        c.numDoors = 4;
        c.printDetails();
        //Accessing feilds of super class
        c.category = "Four Wheeler";
        c.name = "Car";
        c.printCategory();
        //Overriding message
        //In this case, the method in the subclass overrides the method in the superclass.
        //This concept is known as method overriding in Java.
        c.message();

        Bike b = new Bike();
        b.category = "Two Wheeler";
        b.name = "Bike";
        b.type = "Mountain Bike";
        b.price = 5000;
        b.printCategory();
        b.description();
    }
}
