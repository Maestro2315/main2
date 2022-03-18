public class Headphones implements Devices {
    @Override

    public void turnOn() {
        System.out.println("Device powered ON!");
    }

    public void plays() {
        System.out.println("Headphones plays!");
    }

    @Override

    public void turnOff() {
        System.out.println("Device powered OFF!");
    }
}