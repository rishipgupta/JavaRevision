package basics.staticexamples;

public class StaticKeywordExample {
    static String name;
    static int age;
    static double marks;
    //Initializing static variables in static block
    static{
        name = "Ron";
        age = 23;
    }
    //Multiple static blocks
    //name and age will be overridden in second static block
    static{
        name = "Harry";
        age = 24;
        marks = 85.12;
    }
}
