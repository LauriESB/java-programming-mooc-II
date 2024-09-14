
/**
 *
 * @author llasantinelli
 */
public class TripleTacoBox implements TacoBox {

  private int numberOfTacos;

  public TripleTacoBox() {
    numberOfTacos = 3;
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
