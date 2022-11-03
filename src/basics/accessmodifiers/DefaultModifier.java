package basics.accessmodifiers;

public class DefaultModifier {
    //Following instance variable and method does not have any explicit access modifier
    //Compiler attaches default modifier
    int num = 10;

    int display(int num) {
        this.num = num * 2;
        System.out.println(this.num);
        return this.num;
    }

    public static void main(String[] args) {
        DefaultModifier obj = new DefaultModifier();
        obj.display(5);
    }
}
