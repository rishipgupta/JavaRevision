package basics.constructor;

public class InvokeConstructor {
    InvokeConstructor(){
        System.out.println("When obj created , Constructor gets invoked and this line prints automatically");
    }

    public static void main(String[] args) {
        InvokeConstructor obj = new InvokeConstructor();
    }
}
