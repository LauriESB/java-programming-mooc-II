
import java.util.Objects;


public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object object) {
        if(object == null || this.getClass() != object.getClass()) {
            return false;
        }
      
        if(object == this) {
            return true;
        }
        
        Item newItem = (Item) object;
        
        return this.name.equals(newItem.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    
    
    
    
}
