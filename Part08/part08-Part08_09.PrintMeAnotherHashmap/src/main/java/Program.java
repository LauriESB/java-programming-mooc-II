
import java.util.HashMap;

public class Program {

  public static void main(String[] args) {

    // The exercise template contains the already familiar classes Book and Program. 
    // In the class Program implement the following class methods:
    // public static void printValues(HashMap<String,Book> hashmap), 
    // which prints all the values in the hashmap given as a parameter using the toString method of the Book objects.
    // public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text), 
    // which prints only the Books in the given hashmap which name contains the given string.
    HashMap<String, Book> hashmap = new HashMap<>();
    hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
    hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

    printValues(hashmap);
    System.out.println("---");
    printValueIfNameContains(hashmap, "prejud");
  }

  public static String cleanString(String text) {
    if (text == null) {
      return "";
    }

    text = text.toLowerCase();
    return text.trim();
  }

  public static void printValues(HashMap<String, Book> hashmap) {
    for (Book book : hashmap.values()) {
      System.out.println(book);
    }
  }

  public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
    String name = cleanString(text);

    for (Book book : hashmap.values()) {
      if (book.getName().contains(name)) {
        System.out.println(book);
      }
    }

  }

}
