import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentComparable{
    public static void main(String args[]){

        List<Student> students = new ArrayList<>();

        students.add(new Student("Aarav", 101, 3.8));
        students.add(new Student("Meera", 102, 3.5));
        students.add(new Student("Rohan", 103, 3.9));
        students.add(new Student("Sneha", 104, 3.7));

       Collections.sort(students);

       for(Student s : students){
            System.out.println(s);
       } 
    }
}