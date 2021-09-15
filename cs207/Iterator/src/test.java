import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {

    public static void main(String[] args) {

        List<String> l = new ArrayList();
        //ArrayList<String> l = new ArrayList<>();
        Set<String> set = new HashSet<>();
        l.add("aa");
        l.add("bb");
        l.add("cc");
/*
        for (Iterator iter = l.iterator(); iter.hasNext();) {
            String str = (String)iter.next();
            System.out.println(str);
        }
*/
        Iterator<String> iter = l.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }

        for(String s : l){//foreach
            System.out.println(s);
        }

    }

}
