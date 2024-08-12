
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container = new Container();
        while (true) {
            System.out.println(container);
            String userInput = scan.nextLine();
            
            String[] parts = userInput.split(" ");
            String command = parts[0];
            
            if (command.equals("quit")) {
                break;
            }
             
            int value = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                container.add(value);
            } else if (command.equals("move")) {
                container.move(value);
            } else if (command.equals("remove")) {
                container.remove(value);
            }

        }
    }

}
