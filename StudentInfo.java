import java.util.HashMap;
import java.util.Scanner;

class StudentDetails{
    String name;
    int score;

    StudentDetails(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}

public class StudentInfo {
    public static void main(String args[]){
        HashMap<Integer,StudentDetails> student = new HashMap<>();
        student.put(1,  new StudentDetails("Yashika", 100));
        student.put(2,  new StudentDetails("Avni", 60));
        student.put(3,  new StudentDetails("Shubham", 85));
        student.put(4,  new StudentDetails("Yashika", 90));
        student.put(5,  new StudentDetails("Alia", 40));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id you want to search : ");
        int id = sc.nextInt();

        System.out.println("Name : " + student.get(id).getName());
        System.out.println("Score : " + student.get(id).getScore());
        sc.close();
    }
}
