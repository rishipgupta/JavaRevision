package basics.accessmodifiers;

final public class FinalKeyword {
    final int AGE = 10;
    final void displayMessage(){
        System.out.println("This is final message");
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        //Following code throws error and final variable can not be reinitialised
//        obj.AGE = 20;
        //final class FinalKeyword can not be extended
//        class Nested extends FinalKeyword{
            //Following method is final and can not be overridden
//            void displayMessage(){
//                System.out.println("This is nested message");
//            }
//        }

    }
}
