
public class Main {

  public static void main(String[] args) {
    // Part01. 
    // Part02. Add into de ProductWarehouse class the methods:
    //         public void setName(String newName) - sets a new name for the product.
    //         public String toString() - Returns the state of the object represented as a string like this Juice: balance = 64.5, space left 123.5
    // Part03. Public constructors and methods of the ChangeHistory class
    // Part04. Build on the ChangeHistory class by adding analysis methods:
    // Part05. Implement ProductWarehouseWithHistory as a subclass of ProductWarehouse.
    // Part06. Expand the class with the following methods
    //         public void addToWarehouse(double amount) works just like the method in the Warehouse class, but we also record the changed state to the history. NB: the value recorded in the history should be the warehouse's balance after adding, not the amount added!
    //         public double takeFromWarehouse(double amount) works just like the method in the Warehouse class, but we also record the changed state to the history. NB: the value recorded in the history should be the warehouse's balance after removing, not the amount removed!

    // Part07. Expand the class with the method public void printAnalysis()
    
    ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
    juice.takeFromWarehouse(11.3);
    juice.addToWarehouse(1.0);
    //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

    juice.printAnalysis();
  }

}
