
/**
 *
 * @author llasantinelli
 */
public class Container {

  private int container01;
  private int container02;

  public Container() {
    this.container01 = 0;
    this.container02 = 0;
  }

  public int contains() {
    return container01;
  }

  public void add(int amount) { // adds only to the first container
    if (amount >= 0) {
      container01 += amount;

      if (container01 > 100) {
        container01 = 100;
      }
    }
  }

  public void remove(int amount) { // remove only from the second container
    if (amount > 0) {
      container02 -= amount;

      if (container02 < 0) {
        container02 = 0;
      }
    }
  }

  public void move(int amount) { // moves from the first to the second container
    if (amount > 0) {

      if (amount > container01) {
        amount = container01;
      }

      container01 = container01 - amount;
      container02 = container02 + amount;

      if (container02 > 100) {
        container02 = 100;
      }
    }
  }

  public String toString() {
    return "First: " + container01 + "/100\n" + "Second: " + container02 + "/100";
  }
}
