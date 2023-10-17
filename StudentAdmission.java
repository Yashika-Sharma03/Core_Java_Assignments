import java.util.Map;
import java.util.HashMap;

public class StudentAdmission {
    public static void main(String args[]){
        Map<Integer,String> students = new HashMap<>();
        students.put(0, "Robbin");
        students.put(1, "Luffy");
        students.put(2, "Zoro");

        // traversing through Map
        System.out.println("Printing key value pairs");
        for(Map.Entry<Integer,String> student: students.entrySet()){
            System.out.println(student.getKey() + " : " + student.getValue());
        }

        Map<Integer,String> students2 = new HashMap<>();
        students2.putAll(students);
        System.out.println("other HashMap " + students2);
        System.out.println(students2.equals(students));
        
        students.remove(1);
        System.out.println("keyset " + students.keySet());
        System.out.println("values " + students.values());

        System.out.println(students2.equals(students));

        System.out.println("current size is " + students.size());
        System.out.println(students.containsKey(2));
        students.clear();
        System.out.println(students.isEmpty());
        System.out.println(students.keySet());
    }
}
