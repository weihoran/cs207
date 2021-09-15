public class Student implements Comparable<Student>{
    String name;
    int studentNumber;

    public Student(String name, int studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentNumber - o.studentNumber;
    }
}
