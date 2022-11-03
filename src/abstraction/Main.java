package abstraction;

public class Main {
    public static void main(String[] args) {
        MotorBike m = new MotorBike();
        m.topSpeed = 100;
        m.setTopSpeed(180);
        System.out.println(m.topSpeed);

        SportsBike s = new SportsBike();
        s.setTopSpeed(250);

    }
}
