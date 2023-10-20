import java.util.LinkedList;

public class Alphabets {
    public static void main(String args[]){
        LinkedList<String> alphabets = new LinkedList<>();
        alphabets.add("B");
        alphabets.add("D");

        System.out.println(alphabets);

        alphabets.addFirst("A");
        alphabets.add(2, "C");
        
        System.out.println(alphabets);

        System.out.println("Index of C : " + alphabets.indexOf("C"));
        System.out.println("Last element : " + alphabets.getLast());

    }
}
