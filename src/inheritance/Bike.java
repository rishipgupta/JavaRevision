package inheritance;

public class Bike extends Vehicle {
    String type;
    int price;

    void description(){
        System.out.println(name + " is a "+ type + " and costs "+price+" rupees.");
    }
}
