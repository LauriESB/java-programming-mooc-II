
/**
 *
 * @author llasantinelli
 */
public class CD implements Packable {

  private String artist;
  private String nameOfCD;
  private int pubYear;

  public CD(String artist, String nameOfCD, int pubYear) {
    this.artist = artist;
    this.nameOfCD = nameOfCD;
    this.pubYear = pubYear;
  }

  public double weight() {
    return 0.1;
  }

  public String toString() {
    return this.artist + ": " + this.nameOfCD + " (" + this.pubYear + ")";
  }
}
