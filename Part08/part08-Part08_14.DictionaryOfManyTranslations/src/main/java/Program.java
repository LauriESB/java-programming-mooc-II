
public class Program {

  public static void main(String[] args) {
    
    // Your assignment is to create the class DictionaryOfManyTranslations. 
    // In it can be stored one or more translations for each word. 
    // The class is to implement the following methods:
    // public void add(String word, String translation) adds the translation for the word and preserves the old translations.
    // public ArrayList<String> translate(String word) returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
    // public void remove(String word) removes the word and all its translations from the dictionary.

    DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
    dictionary.add("lie", "maata");
    dictionary.add("lie", "valehdella");

    dictionary.add("bow", "jousi");
    dictionary.add("bow", "kumartaa");

    System.out.println(dictionary.translate("lie"));
    dictionary.remove("bow");
    System.out.println(dictionary.translate("bow"));
  }
}
