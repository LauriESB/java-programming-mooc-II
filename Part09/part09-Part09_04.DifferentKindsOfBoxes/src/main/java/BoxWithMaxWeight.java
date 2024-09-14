import java.util.ArrayList;

/**
 *
 * @author llasantinelli
 */
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> itensArray;
  
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        itensArray = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.capacity >= item.getWeight()) {
            this.capacity -= item.getWeight();
            itensArray.add(item);
        }   
    }
    
    public boolean isInBox(Item item) {
        return this.itensArray.contains(item);
    }
}
