package basics.staticexamples;

public class NestedClass {
    static String name = "Bruno";
    static class InnerClass{

         void display(){
             System.out.println(name);
         }
    }
}
