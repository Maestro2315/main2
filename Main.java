import java.util.List;
import java.util.Scanner;

public class Main {
    public Scanner scanner;

    public static void main(String[] args) {
        WareHouse computerWarehouse = new ComputerWarehouse();
        ComputerCreator computerCreator = new ComputerCreator();
        Computer computerhyper = computerCreator.createHyper();
        Computer computeraerocool = computerCreator.createAerocool();
        Computer computercougar = computerCreator.createCougar();
        Computer computersamsung = computerCreator.createSamsung();
        Computer computersamsing2 = computerCreator.createSamsung2();
        computerWarehouse.addItem(computeraerocool);
        computerWarehouse.addItem(computerhyper);
        computerWarehouse.addItem(computercougar);
        computerWarehouse.addItem(computersamsung);
        computerWarehouse.addItem(computersamsing2);
        List<Computer> computers = (List<Computer>) computerWarehouse.getAllItems();
        for (Computer computer : computers) {
            System.out.println(computer);
        }
        Computer searchResult = (Computer) computerWarehouse.searchByName("aerocool");
        System.out.println("Компьютер по назанию aerocool: ");
        System.out.println(searchResult);
        Computer searchResult1 = (Computer) computerWarehouse.searchByName("hyper");
        System.out.println("Компьютер по названию hyper: ");
        System.out.println(searchResult1);
        System.out.println(computersamsung.equals(computersamsing2));
        // Devices headphones = new Headphones();
        // ((Headphones) headphones).plays();
        // Devices monitor = new Monitor();
        // ((Monitor) monitor).showsPic();
        // Devices[] devices = {monitor, headphones};
        // Devices FriendPC = new FriendPC("hyperpc");
        // Devices[] devices = {FriendPC};
        //for (Devices device : devices) {
        //    device.turnOn();
        // }

        //for (Devices device : devices)
        //   device.turnOff();

        //ComputerCreator ComputerCreator = new ComputerCreator();
        //System.out.println(ComputerCreator.create());
//pov: Заработало лол.
    }
}
