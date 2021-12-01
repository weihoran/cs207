package student;

import student.Student;
import student.StudentManager;

import java.util.Iterator;

public class testStudent {
    public static void main(String[] args){
        StudentManager sml = new StudentManager("CSC207");
        sml.addStudent(new Student("A. Stu", 12));

        for (Student s : sml){
            System.out.println(s);
        }

        for (Iterator iter = sml.iterator(); iter.hasNext();) {
            Student stu = (Student) iter.next();
            System.out.println(stu);
        }






        }
}
