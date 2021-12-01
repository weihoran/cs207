import java.util.*;

public class main {

    public static void main(String[] args) {

        //-----------Set-------------------------------------------------
        //Set<String> myset = new HashSet<>();
        //Set<String> myset = new LinkedHashSet<>();

        Set<String> myset = new TreeSet<>();

        myset.add("aa");
        myset.add("cc");
        myset.add("bb");
        myset.add("aa");

        for(String s : myset){
            System.out.println(s);
        }



        //------------------List---------------------------------
        List<String> mylist = new ArrayList<>();
        List<String> target = new Vector<>();

        //ConcurrentModificationException
        mylist.add("a");mylist.add("b");mylist.add("c");mylist.add("d");
        target.add("a");target.add("b");target.add("c");target.add("e");

        List<String> toBeRemoved = new ArrayList<>();
        for(String s : mylist){
            if (target.contains(s))
                toBeRemoved.add(s);
        }

        //solution1
        for(String s : toBeRemoved){
                mylist.remove(s);
        }

        // solution2
        for(Iterator<String> iterator = mylist.iterator(); iterator.hasNext();) {
            String s = iterator.next();
            if (target.contains(s)){
                iterator.remove();
            }
        }

        // solution3
        mylist.removeIf(target::contains);

        for(String s: mylist)
            System.out.println(s);





        //------------------Queue---------------------------------
        //Queue<String> myqueue = new PriorityQueue<>();
        Queue<String> myqueue = new LinkedList<>();
        //List<String> myqueue = new LinkedList<>();
        myqueue.add("aaa");
        myqueue.add("bbb");
        myqueue.add("ccc");

        System.out.println(myqueue.peek());
        System.out.println(myqueue.poll());
        System.out.println(myqueue.peek());


        //---------Hashmap--------------------
        //Map<Integer, String> mymap = new Hashtable<>();
        Map<Integer, String> mymap = new HashMap<>();
        List<String> mylist = new ArrayList<>();
        mymap.put(1,"aaaa");
        mymap.put(2,"bbbb");

        System.out.println(mymap.containsKey(1));
        System.out.println(mymap.containsValue("aaaa"));

        for(Integer key : mymap.keySet())
            System.out.println(mymap.get(key));

        for(String value : mymap.values())
            System.out.println(value);

    }



}
