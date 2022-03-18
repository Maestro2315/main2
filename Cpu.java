public class Cpu {
    private String frequency;
    private int socket;
    private int core;
    private int streams;

    public Cpu(String frequency, int socket, int core, int streams){
        this.frequency = frequency;
        this.socket = socket;
        this.core = core;
        this.streams = streams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpu cpu = (Cpu) o;
        return socket == cpu.socket
                && core == cpu.core
                && streams == cpu.streams
                && frequency.equals(cpu.frequency);
    }

//    @Override
//    public int hashCode() {
//        return 0;
//  }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nsocket: ");
        stringBuilder.append(this.socket);
        stringBuilder.append("\ncore: ");
        stringBuilder.append(this.core);
        stringBuilder.append("\nstreams: ");
        stringBuilder.append(this.streams);
        return stringBuilder.toString();
        //return "\nfrequency: " + this.frequency + "\nsocket: " + this.socket + "\ncore: " + this.core + "\nstreams: " + this.streams;

    }
}