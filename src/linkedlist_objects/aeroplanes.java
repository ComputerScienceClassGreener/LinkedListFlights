package linkedlist_objects;


public class aeroplanes {

    // we encapsulate these fields by making getters and setters for them
    private String name;
    
    private String ID;
    
    private int capacity;
    
    // this is the contructor to build the object
    public aeroplanes(String name, String ID, int capacity){
        
        this.name = name;
        this.ID = ID;
        this.capacity = capacity;
    }

   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public String getID() {
        return ID;
    }

   
    public void setID(String ID) {
        this.ID = ID;
    }

   
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
}
