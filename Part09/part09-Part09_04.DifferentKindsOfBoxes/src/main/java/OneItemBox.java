import java.util.ArrayList;

/**
 *
 * @author llasantinelli
 */
public class OneItemBox extends Box{
    private ArrayList<Item> itensArray;
    
    public OneItemBox() {
        this.itensArray = new ArrayList<>();
    }
    
    public void add(Item item) {
        if(this.itensArray.isEmpty()) {
            this.itensArray.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        return this.itensArray.contains(item);
    }
}
