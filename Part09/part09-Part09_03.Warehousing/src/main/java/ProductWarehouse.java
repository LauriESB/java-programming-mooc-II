
/**
 *
 * @author llasantinelli
 */
public class ProductWarehouse extends Warehouse {

  private String productName;

  public ProductWarehouse(String productName, double capacity) {
    super(capacity);
    this.productName = productName;
  }

  public String getName() {
    return productName;
  }

  public void setName(String productName) {
    this.productName = productName;
  }

  public String toString() {
    return this.productName + ": balance = " + super.getBalance() + ", space left " + super.howMuchSpaceLeft();
  }

}
