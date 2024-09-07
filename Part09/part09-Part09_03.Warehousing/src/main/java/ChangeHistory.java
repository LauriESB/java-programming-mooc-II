
import java.util.ArrayList;

/**
 *
 * @author llasantinelli
 */
public class ChangeHistory {

  private ArrayList<Double> history;

  public ChangeHistory() {
    history = new ArrayList<>();
  }

  public void add(double status) {
    history.add(status);
  }

  public void clear() {
    history.clear();
  }

  public double maxValue() {
    if (!(this.history.isEmpty())) {
      double maxVal = this.history.get(0);
      for (Double percorre : this.history) {
        if (percorre >= maxVal) {
          maxVal = percorre;
        }
      }

      return maxVal;
    }

    return 0;
  }

  public double minValue() {
    if (!(this.history.isEmpty())) {
      double minVal = this.history.get(0);
      for (Double percorre : this.history) {
        if (percorre <= minVal) {
          minVal = percorre;
        }
      }
      return minVal;
    }
    return 0;
  }

  public double average() {
    double sum = 0, avg = 0;

    if (!(this.history.isEmpty())) {
      for (Double percorre : this.history) {
        sum += percorre;
      }
      avg = sum / this.history.size();
      return avg;
    }
    return 0;
  }

  public String toString() {
    return this.history.toString();
  }
}
