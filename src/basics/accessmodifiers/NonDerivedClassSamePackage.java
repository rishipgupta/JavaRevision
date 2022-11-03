package basics.accessmodifiers;

public class NonDerivedClassSamePackage {
    public static void main(String[] args) {
        DefaultModifier obj1 = new DefaultModifier();
        System.out.println(obj1.num);
        obj1.display(20);

        //Accessing protected variable in non derived class same package
        ProtectedModifier objProc = new ProtectedModifier();
        System.out.println(objProc.name);

    }
}
