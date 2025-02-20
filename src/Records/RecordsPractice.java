package Records;

import java.io.Serializable;

public class RecordsPractice {
    public record Student(int id, String name) {
        private static final String DEFAULT_NAME = "unnamed";
        public Student() { //a non-canonical constructor
            this(10); //this line or a call to the canonical constructor is required
        }

        public Student(int id) { //another non-canonical constructor
            this(id, ""); //this line is required
        }


        public Student(int id, String name) { //regular form canonical constructor
            this.id = id;
            this.name = (name == null) ? DEFAULT_NAME : name;
        }

        public void add() {
            System.out.println("Student  added");
        }
    }

    public static void main(String[] args) {
        //literal binary representation of number 5
        int number = 0b00_0101;
        System.out.println("number is " + number);


        System.out.println(printMe(12));
        float c = 6f%2.3f ;
        System.out.println("c is " + c);
    }
    static int printMe(int x){ int y = x ^ ~x; return y; }

}

interface StudentService {
    record Student(int id, String name) implements Serializable {
        public void add() {
            System.out.println("Student  added");
        }
    }

    default Student getStudent() {
        return new Student(0, "");
    }
    abstract public void add() throws Exception;
    static String getValue1(StudentService service) {return service.getStudent().name;}
    static String getValue2(StudentService service) {return service.getStudent().name;}

}