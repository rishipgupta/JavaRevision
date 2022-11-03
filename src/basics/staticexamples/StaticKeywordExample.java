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
    //---------------------------------------------------------------------//
    //Static Variables Example
    static int costPrice;
    static int sellingPrice;

    static void printPrices(){
        costPrice = 100;
        sellingPrice = 150;
        System.out.println(costPrice);
        System.out.println(sellingPrice);

    }

    int calculateProfit(){
        System.out.println(sellingPrice-costPrice);
        return sellingPrice-costPrice;
    }

    //-----------------------------------------------------------------------------
    //Static Methods
    String dogName = "tuffy";
    static int dogAge = 7;
    static void printNonStaticObjec(String name){
        //accessing non static variable indirectly through object in Driver code file.
        System.out.println(name);
        //accessing static variables directly
        System.out.println(dogAge);
    }
}














