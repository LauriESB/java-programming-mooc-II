
public class Main {

  // Create a method public int hashCode() for the SimpleDate class, 
  // which calculates a hash for the the SimpleDate object. Implement 
  // the calculation of the hash in way that there are as few similar 
  // hashes as possible between the years 1900 and 2100.
  public static void main(String[] args) {

    SimpleDate date1 = new SimpleDate(1, 1, 1900);
    SimpleDate date2 = new SimpleDate(2, 1, 1900);
    SimpleDate date3 = new SimpleDate(31, 12, 2100);
    SimpleDate date4 = new SimpleDate(1, 1, 2000);

    // Print the hash codes
    System.out.println("Hash code for ' " + date1 + "': " + date1.hashCode());
    System.out.println("Hash code for '" + date2 + "': " + date2.hashCode());
    System.out.println("Hash code for '" + date3 + "': " + date3.hashCode());
    System.out.println("Hash code for '" + date4 + "': " + date4.hashCode());

  }
}
