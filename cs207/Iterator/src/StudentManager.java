import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StudentManager implements Iterable<Student>{

    private String courseCode;
    private ArrayList<Student> studentList = new ArrayList<>();
    public StudentManager(String courseCode){
        this.courseCode = courseCode;
    }

    public void addStudent(Student s){
        studentList.add(s);
        Collections.sort(studentList);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }

    class StudentIterator implements Iterator<Student>{
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return !(currentIndex >= studentList.size()-1);
        }

        @Override
        public Student next() {
            Student s = studentList.get(currentIndex);
            currentIndex++;
            return s;
        }

    }


}
