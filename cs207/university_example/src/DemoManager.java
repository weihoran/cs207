import java.io.IOException;

public class DemoManager {

    public static void main(String[] args) throws IOException {
        demoStudentManager();
    }

    public static void demoStudentManager() throws IOException {

        String csvPath =
                "/Users/ilirdema/uoft/teaching/csc207/utmf2021/java/classwork/w06-prep/students.csv";
        StudentManager sm = new StudentManager();    
        System.out.println(sm);

        // Loads data from a CSV for first launch of the program
        sm.readFromCSVFile(csvPath);
        System.out.println(sm);
        
        // adds a new student to StudentManager sm's records
        sm.add(new Student(new String[] {"New", "Student"}, "10102000", "F", "1122334455"));
        System.out.println(sm);
        
        // ser isn't a standard extension.    
        String path =
                "/Users/ilirdema/uoft/teaching/csc207/utmf2021/java/classwork/w06-prep/students.ser";
        
        // Writes the existing Student objects to file.
        // This data is serialized and written to file as a sequence of bytes.
        sm.saveToFile(path);
    }
}
