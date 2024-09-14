
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Part01. Implement the class TripleTacoBox, that implements the TacoBox interface. 
    //         TripleTacobox has a constructor with no parameters. 
    //         TripleTacobox has an object variable tacos which is initialized at 3 when the constructor is called.

    // Part02. Implement the class CustomTacoBox, that implements the TacoBox interface. 
    //         CustomTacoBox has a constructor with one parameter defining the initial number of tacos in the box.
    Scanner scanner = new Scanner(System.in);

    System.out.println("TRIPLE TACO BOX");
    TripleTacoBox tacos = new TripleTacoBox();
    System.out.println("Initial number of tacos: " + tacos.tacosRemaining());
    System.out.println("How many times do you want to eat?");
    int times = scanner.nextInt();

    for (int i = 0; i < times; i++) {
      tacos.eat();
    }

    System.out.println("Tacos after eating: " + tacos.tacosRemaining());

    // _____________________________________________________________________
    System.out.println("CUSTOM TACO BOX");

    System.out.println("How many tacos do you want?");
    int tacosNum = scanner.nextInt();

    CustomTacoBox customTacos = new CustomTacoBox(tacosNum);
    System.out.println("How many times do you want to eat?");
    int timesEat = scanner.nextInt();

    for (int i = 0; i < timesEat; i++) {
      customTacos.eat();
    }

    System.out.println("Tacos after eating: " + customTacos.tacosRemaining());

  }
}
