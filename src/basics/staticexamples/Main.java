package basics.staticexamples;

public class Main {
    public static void main(String[] args) {
        //accessing static variables using class
        //We need not create any object for that
        System.out.println(StaticKeywordExample.name);
        System.out.println(StaticKeywordExample.age);
        System.out.println(StaticKeywordExample.marks);

        //accessing static variables directly in static methods
        StaticKeywordExample.printPrices();
        StaticKeywordExample s1 = new StaticKeywordExample();
        System.out.println("Profit with initial values");
        s1.calculateProfit();

        //changing values of static variables through another object
        StaticKeywordExample s2 = new StaticKeywordExample();
        System.out.println("Profit after changing initial value of cost price");
        s2.costPrice = 50;
        s1.calculateProfit();
    }
}
