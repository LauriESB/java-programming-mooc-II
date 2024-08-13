
import java.util.HashMap;

public class Program {

  // Exercise template contains a class Program. Implement the following class methods in the class:
  public static void main(String[] args) {
    HashMap<String, String> hashmap = new HashMap<>();
    hashmap.put("f.e", "for example");
    hashmap.put("etc.", "and so on");
    hashmap.put("i.e", "more precisely");

    printKeys(hashmap);
    System.out.println("---");
    printKeysWhere(hashmap, "i");
    System.out.println("---");
    printValuesOfKeysWhere(hashmap, ".e");
  }

  public static void printKeys(HashMap<String, String> hashmap) {
    for (String aux : hashmap.keySet()) {
      System.out.println(aux);
    }
  }

  public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
    for (String aux : hashmap.keySet()) {
      if (aux.contains(text)) {
        System.out.println(aux);
      }
    }
  }

  public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
    for (String aux : hashmap.keySet()) {
      if (aux.contains(text)) {
        System.out.println(hashmap.get(aux));
      }
    }
  }

}
