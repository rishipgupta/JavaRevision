package basics.ClassIntroduction;

//Class Declaration
public class Dog {
    //Instance Variables;
    String name;
    String breed;
    int age;
    String color;

    //Constructor Declaration of Class
    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed= breed;
        this.age = age;
        this.color = color;
    }

    //method 1
    public String getName(){
        return name;
    }
    //method 2
    public String getBreed(){
        return breed;
    }

    //method 3
    public int getAge(){
        return age;
    }
    //method 4
    public String getColor(){
        return color;
    }

    //main function through which our java code would run
    public static void main(String[] args) {
        //Creating an object with new Keyword
        // className objectName = new constructorName(parameters if any);
        Dog d1 = new Dog("Tommy","Pitbull",8,"Brown");
        //accessing attributes and methods of class through our object d1;
        System.out.println(d1.getName());
        System.out.println(d1.getBreed());
        System.out.println(d1.getAge());
        System.out.println(d1.getColor());
    }
}
