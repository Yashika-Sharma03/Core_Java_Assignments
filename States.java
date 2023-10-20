import java.util.HashSet;
import java.util.Iterator;

public class States {
    public static void main(String args[]){
        HashSet<String> states = new HashSet<String>(); 
  
        states.add("Gujrat"); 
        states.add("Madhya Pradesh"); 
        states.add("Goa"); 
  
        // Adding duplicate element
        states.add("Gujrat"); 
  
        // Displaying tstatese HashSet 
        System.out.println(states); 
        System.out.println("Set contains Goa or not : " + states.contains("Goa")); 

        // removing element
        states.remove("Goa"); 
        System.out.println("Set after removing Goa : " + states); 

        states.add(null);
        states.add(null);
  
        System.out.println("Iterating over Set : "); 
  
        // Iterating over HashSet items 
        Iterator<String> i = states.iterator(); 
  
        while (i.hasNext()) 
            System.out.println(i.next()); 
    }
}
