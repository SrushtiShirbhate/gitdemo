package Assesment;
 
import java.util.*;
 
public class StringHashMap {
 
    // This map stores unsorted values
    static HashMap<Integer, String> m = new HashMap<>();
 
    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        m.put(7, "seven");
        m.put(5, "five");
        m.put(1, "one");
        m.put(3, "three");
        m.put(9, "nine");
 
        // Calling the function to sortMapByKey to
        // perform sorting based on keys
        sortMapByKey();
    }
 
// Function to sort map by Key
    public static void sortMapByKey()
    	{
    		ArrayList<Integer> sortKeys = new ArrayList<Integer>(m.keySet());
 
    		Collections.sort(sortKeys);
 
    		// Getting value for each key and displaying results.
    		for (Integer x : sortKeys)
    			System.out.println("Key = " + x
                           + ", Value = " + m.get(x));
    	}
 
}