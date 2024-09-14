
public class Main {
  
  // Part01. Implement a Packable interface with a double weight();
  // Part02. Make a class called Box. Items implementing the Packable interface can be packed into a box. 
  //         The Box constructor takes the maximum capacity of the box in kilograms as a parameter.
  // Part03. If you made an class variable double weight in the Box class, replace it with a method which calculates the weight of the box. 

  public static void main(String[] args) {
    Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
    Book book2 = new Book("Robert Martin", "Clean Code", 1);
    Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

    CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
    CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
    CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    System.out.println(cd1);
    System.out.println(cd2);
    System.out.println(cd3);

    Box box = new Box(10);

    box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
    box.add(new Book("Robert Martin", "Clean Code", 1));
    box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(box);
    
    box.add(box);
    
  }

}
