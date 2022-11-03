package abstraction;

public class MotorBike extends Bikes{
    //implementation of abstract method
    public int setTopSpeed(int num){
//        System.out.println(num);
        topSpeed = num;
        return topSpeed;
    }
}
