import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class Test {


    public static void main(String[] args) {
        //Person[] people=new Person[]{new Person("xujian", 20),new Person("xiewei", 10)};

        /*
        int a = 1;
        int b = 2;
        char c = 'a';
        char d = 'b';
        String e = "aaa";
        String f = "bbb";
        System.out.println(a < b);
        System.out.println(c < d);
        */


        List<Person> people = new ArrayList();

        people.add(new Person("Tom",30));
        people.add(new Person("Sam",10));
        people.add(new Person("Kim",20));



        for(Person p : people)
            System.out.println(p.getName());

        //---------Comparable-----------
        Collections.sort(people);

        for(Person p : people)
            System.out.println(p.getName());


        //---------Comparator-----------
        people.sort(new PersonComparator());

        for(Person p : people)
            System.out.println(p.getName());


    }

}
