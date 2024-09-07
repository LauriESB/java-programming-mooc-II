
/**
 *
 * @author llasantinelli
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

  private ChangeHistory ch;

  public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
    super(productName, capacity);
    super.addToWarehouse(initialBalance);
    ch = new ChangeHistory();
    ch.add(initialBalance);

  }

  public void addToWarehouse(double amount) {
    super.addToWarehouse(amount);
    ch.add(super.getBalance());

  }

  public double takeFromWarehouse(double amount) {
    double newAmount = super.takeFromWarehouse(amount);
    this.ch.add(super.getBalance());
    return newAmount;
  }

  public void printAnalysis() {

    System.out.println("Product: " + super.getName()
            + "History: " + ch.toString()
            + "Largest amount of product: " + ch.maxValue()
            + "\nSmallest amount of product: " + ch.minValue()
            + "\nAverage: " + ch.average());
  }

  public String history() {
    return ch.toString();
  }
}
