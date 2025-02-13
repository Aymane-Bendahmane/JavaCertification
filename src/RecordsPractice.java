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
    }

    public static void main(String[] args) {
        //literal binary representation of number 5
        int number = 0b00_0101;
        System.out.println("number is " + number);
    }

}

interface StudentService {
    record Student(int id, String name) {
    }

    default Student getStudent() {
        return new Student(0, "");
    }

}