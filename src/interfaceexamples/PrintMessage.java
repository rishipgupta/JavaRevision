package interfaceexamples;

//Multiple inheritance possible through interface
public class PrintMessage implements Message,Remarks{
   public void diwaliMessage(){
        System.out.println("Happy Diwali");
    }

    public void remarks(){
        System.out.println("Keep it up");
    }

    //name variable coming from Student interface
    //printName coming from Student interface
    //Message interface extends Student
    public void printName(){
        System.out.println(name);
    }
}
