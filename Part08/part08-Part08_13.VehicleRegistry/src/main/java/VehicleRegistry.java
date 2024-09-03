
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author llasantinelli
 */
public class VehicleRegistry {

  private HashMap<LicensePlate, String> licenses;

  public VehicleRegistry() {
    licenses = new HashMap<>();
  }

  public boolean add(LicensePlate licensePlate, String owner) {
    if (!(licenses.containsKey(licensePlate))) {
      licenses.put(licensePlate, owner);
      return true;
    }
    return false;
  }

  public String get(LicensePlate licensePlate) {
    if (!(licenses.containsKey(licensePlate))) {
      return null;
    }
    return licenses.get(licensePlate);
  }

  public boolean remove(LicensePlate licensePlate) {
    if (!(licenses.containsKey(licensePlate))) {
      return false;
    }
    licenses.remove(licensePlate);
    return true;
  }

  public void printLicensePlates() {
    for (LicensePlate recovery : licenses.keySet()) {
      System.out.println(licenses.keySet());
    }
  }

  public void printOwners() {

    ArrayList<String> arrayOwners = new ArrayList<>();
    for (String owner : licenses.values()) {
      if (arrayOwners.contains(owner)) {
        continue;
      }

      System.out.println(owner);
      arrayOwners.add(owner);
    }

    /*
        or
        
        ArrayList<String> arrayOwners = new ArrayList<>();
	      for(LicensePlate recovery : licenses.keySet()) {
	            
	        if(!(arrayOwners.contains(licenses.get(recovery)))) {
	          arrayOwners.add(licenses.get(recovery));
	        }    
	      } 
	        
	      for(String percorre : arrayOwners) {
	        System.out.println(percorre);
	      }
     */
  }
}
