import java.util.List;

public interface WareHouse {
    Computer searchByName(String name);
    void addItem(WarehouseItem andrew);
    List<? extends WarehouseItem> getAllItems();


}