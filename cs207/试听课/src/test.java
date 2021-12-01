import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {


    public static void main(String[] args) {
        // The method body will go here.
        System.out.println(7 + 5);
        System.out.println("aaa" + 5);
        System.out.println("aaa" + "5");
        System.out.println("7" + "5");

        String s = "aaaaaa";
        int i = 1;
        System.out.printf("the value is: %s", s);
        System.out.printf("the value is: %d\n", i);
        System.out.println("the value is:" + s);
        System.out.print("aaa");
        System.out.print("bbb");


        int j = (int)19.6; //j = 19
        int k = (int) Math.floor(19.6);//19
        int l = (int) Math.ceil(19.6); //20
        //int m = (int)"11";
        int m = Integer.parseInt("11");
        int n = 'a'; //n = 97 ASCII

        String ss = String.valueOf(j);
        Object sss = s; //upward casting
        //String ssss = sss; //compiler error
        String  ssss = (String)sss; //downward casting, 有可能runtime exception

        String s1 = new String("hjk"); //string instance
        String s2 = new String("hjk");
        //不能用==比较
        if(s1 == s2){
            System.out.println("1， 2 equals");
        }

        String s3 = "hjk"; //string literal
        String s4 = "hjk";
        //不能用==比较
        if(s3 == s4){
            System.out.println("3，4 equals");
        }

        char c = s1.charAt(2);  // In Python: s1[2]
        // Slicing
        s1 = s1.substring(0, 2); // In Python: s1[:2] => "hj"

        //s1.charAt(2) = 'p'; //compiler error
        char[] as = s1.toCharArray();
        as[1] = 'p';
        s1 = String.valueOf(as);

        String[] sa = {"aa", "bb","cc"}; //array
        int [][] tsa = {
                {1,2,3},
                {4,5,6}
        };
        if(tsa[1][1] == 5)
            System.out.println("equals");
        //tsa.length   => row
        //tsa[0].length  => column


        //List sl = new ArrayList<>();
        List<String> sl2 = new ArrayList<>();//最好
        //ArrayList<String> sl3 = new ArrayList<>();
        //ArrayList<String> sl4 = new ArrayList<String>();
        sl2.add("aa");sl2.add("bb");sl2.add("cc");


        //Map hm = new HashMap<>();
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"aa");
        if(hm.containsKey(1)){
            for(String v : hm.values())
                System.out.println(v);
        }


        int z = 0;
        while(z ++ < 10){
        }


        for(; z<10; z++){
        }

        for(int x = 0; x<10;){
            x++;
        }

        for(int x = 0; ;){
            x++;
            if(x >= 10)
                break;
        }

        // 1 +....+ 100, 10,20,30不加
        int sum = 0;
        for(int num = 1; num <= 5; num++){
            if(num==1 || num == 5)
                continue;
            sum += num;
        }
        System.out.println(sum);

    }

}
