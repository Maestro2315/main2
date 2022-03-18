public class MotherBoard {
    private String name;
    private int socket;
    private String ram;
    private String pci;

    public MotherBoard(int socket, String ram, String pci, String name) {
        this.name = name;
        this.pci = pci;
        this.ram = ram;
        this.socket = socket;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotherBoard that = (MotherBoard) o;
        return socket == that.socket
                && name.equals(that.name)
                && ram.equals(that.ram)
                && pci.equals(that.pci);
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nname: ");
        stringBuilder.append(this.name);
        stringBuilder.append("PCI");
        stringBuilder.append(this.pci);
        stringBuilder.append("\nram: ");
        stringBuilder.append(this.ram);
        stringBuilder.append("\nsocket: ");
        stringBuilder.append(this.socket);
        return stringBuilder.toString();

        //return "\nname: " + this.name + "PCI" + this.pci + "\nram: " + this.ram + "\nsocket: " + this.socket;
    }

}