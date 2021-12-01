import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {

        /*
        String abc = "ABC";
        String abc_regex = "ABC";
        System.out.println(Pattern.matches(abc_regex,abc));
        */

        //Normal Match-------------------------------
        String line = "2017-04-25";
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        System.out.println(Pattern.matches(regex,line));



        //find and extract
        Pattern p = Pattern.compile("[a-z0-9]{2}(a|b|c)\\1");
        Matcher m = p.matcher("a2bbc,1cc2bb12b2c");

        while(m.find()) {
            System.out.println(m.start());
            System.out.println(m.group());
        }


        //Match Group----------------------------------
        regex = "([a-z0-9_\\.-]+)@([a-z\\.]+)\\.([a-z]){2,6}";

        line = "123.abc...@..com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        if(matcher.find()) {
            System.out.printf("\nmatcher.group(0) value:%s", matcher.group(0));
            System.out.printf("\nmatcher.group(1) value:%s", matcher.group(1));
            System.out.printf("\nmatcher.group(2) value:%s", matcher.group(2));
            System.out.printf("\nmatcher.group(3) value:%s", matcher.group(3));
        }

    }

}
