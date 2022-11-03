package basics.accessmodifiers;

public class DerivedClassSamePackage extends DefaultModifier {
    public static void main(String[] args) {
        DerivedClassSamePackage obj = new DerivedClassSamePackage();
        System.out.println(obj.num);
        obj.display(10);

    }
}
