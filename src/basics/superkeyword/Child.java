package basics.superkeyword;

public class Child extends Parent{
    int num = 50;
    Child(){
        super();
        System.out.println("Child's Constructor");
    }
    void message() {
        System.out.println("Child's Message");
    }
    void display(){
        message();
        super.message();
        System.out.println("num: "+ num + " , super.num: "+ super.num);
        int result = num + super.num;
        System.out.println("result: "+ result);
    }
}
