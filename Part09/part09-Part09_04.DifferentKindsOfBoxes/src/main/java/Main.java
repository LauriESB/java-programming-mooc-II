
public class Main {

  public static void main(String[] args) {
    
    // Part01. Implement the equals and hashCode methods for the Item-class
    // Part02. Implement the class BoxWithMaxWeight, that inherits the Box class. 
    //         BoxWithMaxWeight has a constructor public BoxWithMaxWeight(int capacity), that defines the max weight allowed for that box.
    // Part03. Next, implement the class OneItemBox, that inherits the Box class. 
    //         OneItemBox has the constructor public OneItemBox(), and it has the capacity of exactly one item.
    //         Next implement the class MisplacingBox, that inherits the Box-class. 
    //         MisplacingBox has a constructor public MisplacingBox(). You can add any items to a misplacing box, but items can never be found when looked for.
    
    BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
    coffeeBox.add(new Item("Saludo", 5));
    coffeeBox.add(new Item("Pirkka", 5));
    coffeeBox.add(new Item("Kopi Luwak", 5));

    System.out.println(coffeeBox.isInBox(new Item("Saludo")));
    System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
    System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

    System.out.println("\n________________________");

    OneItemBox box = new OneItemBox();
    box.add(new Item("Saludo", 5));
    box.add(new Item("Pirkka", 5));

    System.out.println(box.isInBox(new Item("Saludo")));
    System.out.println(box.isInBox(new Item("Pirkka")));

    System.out.println("\n________________________");
    
    MisplacingBox box2 = new MisplacingBox();
    box2.add(new Item("Saludo", 5));
    box2.add(new Item("Pirkka", 5));

    System.out.println(box2.isInBox(new Item("Saludo")));
    System.out.println(box2.isInBox(new Item("Pirkka")));
  }
}
