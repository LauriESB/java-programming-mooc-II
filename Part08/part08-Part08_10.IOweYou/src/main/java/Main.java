
public class Main {
  
  // Create a class called IOU which has the following methods:
  // constructor public IOU() creates a new IOU
  // public void setSum(String toWhom, double amount) saves the amount owed and the person owed to to the IOU.
  // public double howMuchDoIOweTo(String toWhom) returns the amount owed to the person whose name is given as a parameter.

  public static void main(String[] args) {
    IOU mattsIOU = new IOU();
    mattsIOU.setSum("Arthur", 51.5);
    mattsIOU.setSum("Michael", 30);

    System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
  }
}
