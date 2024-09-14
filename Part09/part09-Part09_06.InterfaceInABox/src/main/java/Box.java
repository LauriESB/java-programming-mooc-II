
import java.util.ArrayList;

/**
 *
 * @author llasantinelli
 */
public class Box implements Packable {

  private ArrayList<Packable> packs;
  private double maximumCapacity;

  public Box(double maximumCapacity) {
    this.maximumCapacity = maximumCapacity;
    this.packs = new ArrayList<>();
  }

  public void add(Packable pack) {
    if (this.weight() + pack.weight() <= this.maximumCapacity) {
      this.packs.add(pack);
    }
  }

  public double weight() {
    double sum = 0;
    for (Packable percorre : packs) {
      sum += percorre.weight();
    }

    return sum;
  }

  public String toString() {
    return "Box: " + packs.size() + " items, total weight " + weight() + " kg";
  }
}
