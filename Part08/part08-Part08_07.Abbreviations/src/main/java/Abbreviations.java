
import java.util.HashMap;

/**
 *
 * @author llasantinelli
 */
public class Abbreviations {

  HashMap<String, String> abbrev;

  public Abbreviations() {
    abbrev = new HashMap<>();
  }

  public String sanitizedString(String a) {
    if (a == null) {
      return "";
    }
    a = a.toLowerCase();
    return a.trim();
  }

  public void addAbbreviation(String abbreviation, String explanation) {
    String name = sanitizedString(abbreviation);

    if (abbrev.containsKey(name)) {
      System.out.println("Abbreviation already added to the list");
    } else {
      abbrev.put(name, explanation);
    }
  }

  public boolean hasAbbreviation(String abbreviation) {
    String name = sanitizedString(abbreviation);
    if (abbrev.containsKey(name)) {
      return true;
    }
    return false;
  }

  public String findExplanationFor(String abbreviation) {
    String name = sanitizedString(abbreviation);
    return abbrev.get(name);
  }
}
