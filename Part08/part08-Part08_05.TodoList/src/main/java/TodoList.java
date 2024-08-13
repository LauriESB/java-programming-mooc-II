
import java.util.ArrayList;

/**
 *
 * @author llasantinelli
 */
public class TodoList {

  private ArrayList<String> list;

  public TodoList() {
    list = new ArrayList<>();
  }

  public void add(String task) {
    list.add(task);
  }

  public void print() {
    for (String percorre : list) {
      System.out.println(list.indexOf(percorre) + 1 + ": " + percorre);
    }
  }

  public void remove(int number) {

    list.remove(list.get(number - 1));

  }
}
