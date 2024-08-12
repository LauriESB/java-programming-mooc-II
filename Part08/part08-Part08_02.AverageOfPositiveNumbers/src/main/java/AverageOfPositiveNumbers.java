
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

  // Write a program that asks user for input until the user inputs 0. 
  // After this, the program prints the average of the positive numbers (numbers that are greater than zero).
  // If no positive number is inputted, the program prints "Cannot calculate the average"
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    ArrayList<Integer> userInputNum = new ArrayList<>();

    while (true) {
      int userInput = Integer.valueOf(scanner.nextLine());
      if (userInput == 0) {
        break;
      }
      if (userInput > 0) {
        userInputNum.add(userInput);
      }
    }

    if (userInputNum.isEmpty()) {
      System.out.println("Cannot calculate the average");
    } else {
      for (int percorre : userInputNum) {
        sum += percorre;
      }
      System.out.println(1.0 * sum / userInputNum.size());
    }
  }
}
