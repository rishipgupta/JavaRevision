package inheritance;

public class Vehicle {
    String name;
    String category;
    void printCategory(){
        System.out.println(name + " is a "+this.category);
    }

    void message(){
        System.out.println("Drive Carefully");
    }
}
