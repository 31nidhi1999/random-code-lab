import java.lang.Comparable;

public class Student implements Comparable<Student> {
        
        private String stdName;
        private int stdRollNo;
        private double stdGpa;

        public Student(String stdName, int id, double stdGpa){
            this.stdName = stdName;
            stdRollNo = id;
            this.stdGpa = stdGpa;
        }

        public String getStdName(){
            return stdName;
        }

        public int getStdRollNo(){
            return stdRollNo;
        }

        public double getStdGpa(){
            return stdGpa;
        }

        @Override
        public int compareTo(Student other){
            return Double.compare(other.getStdGpa(),this.getStdGpa());
        }

        public String toString() {
            return "Student{name='" + stdName + "', id=" + stdGpa + ", gpa=" + stdGpa + "}";
        }

}