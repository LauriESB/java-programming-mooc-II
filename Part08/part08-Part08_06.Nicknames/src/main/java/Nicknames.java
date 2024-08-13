
import java.util.HashMap;

public class Nicknames {

  // In the main-method create a new HashMap<String,String> object. 
  //  Store the names and nicknames of the following people in this hashmap so, that the name is the key and the nickname is the value. Use only lower case letters.
  public static void main(String[] args) {
    HashMap<String, String> nicknames = new HashMap<>();
    nicknames.put("matthew", "matt");
    nicknames.put("michael", "mix");
    nicknames.put("arthur", "artie");

    System.out.println(nicknames.get("arthur"));
  }

}
