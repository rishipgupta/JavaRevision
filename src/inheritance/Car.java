package inheritance;

public class Car extends Vehicle{
    int numDoors;
    String color;
    void printDetails(){
        System.out.println("number of doors: " + numDoors +" Color: " + color);
    }
    @Override
    void message(){
        System.out.println("Car is an amazing vehicle");
    }
}
