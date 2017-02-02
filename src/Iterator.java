
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Simple Java Program which shows How to use Iterator in Java to loop through all elements
 * of Collection classes like ArrayList, LinkedList, HashSet or Map implementation like
 * HashMap,TreeMap and Hashtable.
 */

public class Iterator {

	public static void main(String[] args) {
        //Hashtable instance used for Iterator Example in Java 
        Hashtable<Integer, String> stockTable=new Hashtable<Integer,String>();

        //Populating Hashtable instance with sample values
        stockTable.put(new Integer(1), "One");
        stockTable.put(new Integer(2), "Two");
        stockTable.put(new Integer(3), "Three");
        stockTable.put(new Integer(4), "Four");

        //Getting Set of keys for Iteration
        Set<Entry<Integer, String>> stockSet = stockTable.entrySet();

        // Using Iterator to loop Map in Java, here Map implementation is Hashtable
        java.util.Iterator<Entry<Integer, String>> i= stockSet.iterator();
        System.out.println("Iterating over Hashtable in Java");
        
        //Iterator begins
        while(i.hasNext()){
            Map.Entry<Integer,String> m=i.next();
            int key = m.getKey();
            String value=m.getValue();
            System.out.println("Key :"+key+"  value :"+value);

        }
        System.out.println("Iteration over Hashtable finished");
    }
}
