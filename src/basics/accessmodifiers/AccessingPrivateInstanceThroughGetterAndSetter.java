package basics.accessmodifiers;

public class AccessingPrivateInstanceThroughGetterAndSetter {
    public static void main(String[] args) {
        PrivateModifier obj = new PrivateModifier();
        //accessing private variable outside class through setter and getter
        obj.setNum(100);
        obj.getNum();
    }

}
