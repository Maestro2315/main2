import java.util.Objects;
import java.util.Scanner;
public class ComputerCreator {
    public Cpu cpu;

    public ComputerCreator() {
    }

    public Computer createAerocool() {
        Name name = new Name("Aerocool");
        MotherBoard mom = new MotherBoard(2011, "2 slots", "Express 4.0 Hardware Design", "H480m");
        VideoAdapter videocard = new VideoAdapter("GTX1060", "3GB");
        Ram ramka = new Ram("vengeance", "2*8GB", "2666Mhz");
        Hdd hddshnik = new Hdd(5400, "1TB");

        Cpu processor = new Cpu("4.2MHz", 2011, 4, 8);
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Частота процессора в MHz: ");
        String cpuFrequency = sc.nextLine();
        System.out.println("Номер сокета: ");
        int cpuSocket = sc.nextInt();
        System.out.println("Колличество ядер: ");
        int cpuCores = sc.nextInt();
        System.out.println("Колличество потоков: ");
        int cpuStreams = sc.nextInt();*/


        // Cpu cpu1 = new Cpu(cpuFrequency, cpuSocket, cpuCores, cpuStreams);

        Computer andrew = new Computer("Aerocool", mom, videocard, ramka, hddshnik, processor);
        return andrew;
    }

    public Computer createHyper() {
        Name name = new Name("hyper");
        MotherBoard mom = new MotherBoard(1200, "4 slots", "Express 6.0 Hardware Design", "H540g");
        VideoAdapter videocard = new VideoAdapter("GTX1660", "6GB");
        Ram ramka = new Ram("gygabite", "4*8GB", "3200Mhz");
        Hdd hddshnik = new Hdd(6200, "2TB");

        Cpu processor = new Cpu("4.4MHz", 1200, 6, 12);
        Computer andrew = new Computer("hyper", mom, videocard, ramka, hddshnik, processor);
        return andrew;
    }

    public Computer createCougar() {
        Name name = new Name("cougar");
        MotherBoard mom = new MotherBoard(1200, "4 slots", "UltraMega SKILL 2.0", "Roofn");
        VideoAdapter videocard = new VideoAdapter("GTX3090", "12GB");
        Ram ramka = new Ram("Hyperx", "4*16Gb", "4200Mhz");
        Hdd hddshka = new Hdd(6200, "2TB");
        Cpu processor = new Cpu("4.6MHz", 2022, 6, 12);
        Computer andrew = new Computer("cougar", mom, videocard, ramka, hddshka, processor);
        return andrew;
    }

    public Computer createSamsung() {
        Name name = new Name("samsung");
        MotherBoard mom = new MotherBoard(5060, "2 slots", "SLABIY PC v1.0", "noob");
        VideoAdapter videocard = new VideoAdapter("GTX650", "2GB");
        Ram ramka = new Ram("NoName", "2*3GB", "1200MHz");
        Hdd hddshka = new Hdd(1400, "500GB");
        Cpu processor = new Cpu("2.1MHz", 1200, 2, 4);
        Computer andrew = new Computer("samsung", mom, videocard, ramka, hddshka, processor);
        return andrew;
    }

    public Computer createSamsung2() {
        Name name = new Name("samsung");
        MotherBoard mom = new MotherBoard(5060, "2 slots", "SLABIY PC v1.0", "noob");
        VideoAdapter videocard = new VideoAdapter("GTX650", "2GB");
        Ram ramka = new Ram("NoName", "2*3GB", "1200MHz");
        Hdd hddshka = new Hdd(1400, "500GB");
        Cpu processor = new Cpu("2.1MHz", 1200, 2, 4);
        Computer andrew = new Computer("samsung", mom, videocard, ramka, hddshka, processor);
        return andrew;
    }
}
