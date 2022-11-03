package basics.accessmodifiers2;

import basics.accessmodifiers.ProtectedModifier;
//Accessing protected variable in derived class different package

public class DerivedClassDifferentPackage extends ProtectedModifier {
    public static void main(String[] args) {
        DerivedClassDifferentPackage obj = new DerivedClassDifferentPackage();
        System.out.println(obj.name);
    }
}
