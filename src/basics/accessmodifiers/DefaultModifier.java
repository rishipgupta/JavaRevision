package basics.accessmodifiers;

public class DefaultModifier {
    //Following instance variable and method does not have any explicit access modifier
    //Compiler attaches default modifier
    int num;
    int display(int num){
        this.num = num*2;
        return this.num;
    }
    public static void main(String[] args) {
        DefaultModifier obj = new DefaultModifier();
        int result = obj.display(5);
        System.out.println(result);

    }
}
