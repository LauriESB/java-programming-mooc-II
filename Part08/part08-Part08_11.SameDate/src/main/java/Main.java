
public class Main {

  // Create a method public boolean equals(Object object) for the SimpleDate class,
  // which returns true if the date of the object passed to the method as a parameter 
  // is the same as the date of the object used to call the method.
  
  public static void main(String[] args) {
    SimpleDate d = new SimpleDate(1, 2, 2000);
    System.out.println(d.equals("heh"));
    System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
    System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
  }
}
