package basics.accessmodifiers;

//Accessing protected variable in derived class same package
public class ProtectedDerivedClassSamePackage extends ProtectedModifier {
    public static void main(String[] args) {
        ProtectedDerivedClassSamePackage obj = new ProtectedDerivedClassSamePackage();
        System.out.println(obj.name);
    }

}
