public class Computer extends WarehouseItem implements Devices {
    protected Socket socket;
    protected String name;
    protected MotherBoard motherboard;
    protected VideoAdapter videoadapter;
    protected Ram ram;
    protected Hdd hdd;
    protected Cpu cpu;

    public Computer(String name, MotherBoard motherboard, VideoAdapter videoadapter, Ram ram, Hdd hdd, Cpu cpu) {
        this.name = name;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.videoadapter = videoadapter;

    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Computer(String name, VideoAdapter videoAdapter, Cpu cpu, Ram ram, MotherBoard motherBoard) {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Computer name: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\n\nMotherBoard: ");
        stringBuilder.append(this.motherboard);
        stringBuilder.append("\n\nRam: ");
        stringBuilder.append(this.ram);
        stringBuilder.append("\n\nHdd: ");
        stringBuilder.append(this.hdd);
        stringBuilder.append("\n\nCPU: ");
        stringBuilder.append("\nType socket: ");
        stringBuilder.append(socket.LGA);
        stringBuilder.append(this.cpu);
        stringBuilder.append("\n\nVideoAdapter: ");
        stringBuilder.append(this.videoadapter);
        stringBuilder.append("\n================================================");
        //return "Computer name: " + this.name + "\nMotherBoard: " + this.motherboard + "\nRam: " + this.ram + "\nHdd: " + this.hdd + "\nCPU: " + this.cpu + "\nVideoAdapter: " + this.videoadapter;
        return stringBuilder.toString();

    }
    public void turnOn(){
        System.out.println(String.format("Computer '%s' is ON", name));
    }

    @Override
    public void turnOff() {
        System.out.println(String.format("Computer '%s' is OFF", name));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return socket == computer.socket
                && name.equals(computer.name)
                && motherboard.equals(computer.motherboard)
                && videoadapter.equals(computer.videoadapter)
                && ram.equals(computer.ram) && hdd.equals(computer.hdd)
                && cpu.equals(computer.cpu);
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }
}
