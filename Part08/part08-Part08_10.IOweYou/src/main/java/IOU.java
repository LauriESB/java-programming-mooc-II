
import java.util.HashMap;

/**
 *
 * @author llasantinelli
 */
public class IOU {

  private HashMap<String, Double> oweTo;

  public IOU() {
    this.oweTo = new HashMap<>();
  }

  public String newString(String toWhom) {
    toWhom = toWhom.toLowerCase();
    return toWhom.trim();
  }

  public void setSum(String toWhom, double amount) {
    String whom = newString(toWhom);

    oweTo.put(whom, amount);
  }

  public double howMuchDoIOweTo(String toWhom) {
    String whom = newString(toWhom);

    if (oweTo.containsKey(whom)) {
      return oweTo.get(whom);
    }
    return 0;
  }
}
