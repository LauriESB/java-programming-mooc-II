
/**
 *
 * @author llasantinelli
 */
public class CustomTacoBox implements TacoBox {

  private int numberOfTacos;

  public CustomTacoBox(int numberOfTacos) {
    this.numberOfTacos = numberOfTacos;
  }

  public int tacosRemaining() {
    return this.numberOfTacos;
  }

  public void eat() {
    this.numberOfTacos--;

    if (this.numberOfTacos < 0) {
      this.numberOfTacos = 0;
    }
  }
}
