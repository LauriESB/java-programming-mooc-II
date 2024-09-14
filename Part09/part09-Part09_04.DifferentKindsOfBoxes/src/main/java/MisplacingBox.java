import java.util.ArrayList;

/**
 *
 * @author llasantinelli
 */
public class MisplacingBox extends Box{
    private ArrayList<Item> itensArray; 
    
    public MisplacingBox() {
        this.itensArray = new ArrayList<>();
    }
    
    public void add(Item item) {
        this.itensArray.add(item);
    }
    
    public boolean isInBox(Item item) {
        return false;
    }
}
