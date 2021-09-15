public class testStudent {
    public static void main(String[] args){
        StudentManager sml = new StudentManager("CSC2ill7");
        sml.addStudent(new Student("A. Stu", 12));
            for (Student s : sml){
                System.out.println(s);
            }
        }
}
