public class Monitor implements Devices {
    public void showsPic() {
        System.out.println("Monitor shows!");
    }
    @Override

    public void turnOn() {
        System.out.println("Device powered ON!");
    }

    @Override

    public void turnOff() {
        System.out.println("Device powered OFF!");
    }
}