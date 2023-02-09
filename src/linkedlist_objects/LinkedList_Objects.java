
package linkedlist_objects;

import java.util.LinkedList;


public class LinkedList_Objects {

   
    public static void main(String[] args) {
        
        // createa our linkedlist data structure
        LinkedList<aeroplanes> flights = new <aeroplanes> LinkedList();
        
        
        // instantiate 5 objects from the aeroplanes class
        aeroplanes flight1 = new aeroplanes("Boeing","BA123",375);
        
        aeroplanes flight2 = new aeroplanes("Lockeed","LH546",280);
        
        aeroplanes flight3 = new aeroplanes("Boeing","TH754",178);
        
        aeroplanes flight4 = new aeroplanes("GrrenerAir","GR834",320);
        
        aeroplanes flight5 = new aeroplanes("Boeing","AB322",365);
        
        
        // add these objects as nodes to the LinkedList data structure
        flights.add(flight1);
        
        flights.add(flight2);
        
        flights.add(flight3);
        
        flights.add(flight4);
        
        flights.add(flight5);
        
        
        
    }

}
