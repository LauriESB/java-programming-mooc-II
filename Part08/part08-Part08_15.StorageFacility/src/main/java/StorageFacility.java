
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author llasantinelli
 */
public class StorageFacility {

  private HashMap<String, ArrayList<String>> storageManagement;

  public StorageFacility() {
    this.storageManagement = new HashMap<>();
  }

  public void add(String unit, String item) {
    this.storageManagement.putIfAbsent(unit, new ArrayList<>());
    this.storageManagement.get(unit).add(item);
  }

  public ArrayList<String> contents(String storageUnit) {
    return this.storageManagement.getOrDefault(storageUnit, new ArrayList<>());
  }

  public void remove(String storageUnit, String item) {
    this.storageManagement.get(storageUnit).remove(item);
    if (this.storageManagement.get(storageUnit).isEmpty()) {
      this.storageManagement.remove(storageUnit);
    }
  }

  public ArrayList<String> storageUnits() {
    ArrayList<String> names = new ArrayList<>();
    for (String percorre : this.storageManagement.keySet()) {
      names.add(percorre);
    }
    return names;
  }
}
