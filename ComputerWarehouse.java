import java.util.ArrayList;
import java.util.List;

public class ComputerWarehouse implements WareHouse {
    private List<Computer> items;

    public ComputerWarehouse() {
        this.items = new ArrayList<>();
    }

    @Override
    public Computer searchByName(String name) {
        for (Computer computer : items) {
            if (computer.getName().equalsIgnoreCase(name)) {
                return computer;
            }
        }
        return null;
    }

    @Override
    public void addItem(WarehouseItem warehouseItem) {
        if (warehouseItem instanceof Computer) {
            items.add((Computer) warehouseItem);
        }
    }

    @Override
    public List<? extends WarehouseItem> getAllItems() {
        return items;
    }
}
