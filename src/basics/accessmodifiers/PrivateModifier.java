package basics.accessmodifiers;

public class PrivateModifier {
    private int num;

    //setter
    public void setNum(int num){
        this.num = num;
    }
    //getter
    public void getNum(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        //Private variables accessible only inside same class
        PrivateModifier obj = new PrivateModifier();
        obj.num = 50;
        System.out.println(obj.num);
    }
}
