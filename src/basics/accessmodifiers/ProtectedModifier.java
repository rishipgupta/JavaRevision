package basics.accessmodifiers;

public class ProtectedModifier {
    protected String name = "Troy";

    public static void main(String[] args) {
        ProtectedModifier objProtected = new ProtectedModifier();
        //Accessible in same class
        System.out.println(objProtected.name);
    }
}
