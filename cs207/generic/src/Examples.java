

import java.util.ArrayList;
import java.util.HashMap;

public class Examples {

        public static void main(String[] args) {
                // Java Collections
                // ArrayList, Hashmap

                int[] myArray = new int[3];
               // myArray[3] = 5; // runtime error

                // - there is no set size
                // - can store any objects
                ArrayList myArrayList = new ArrayList();
                myArrayList.add(3); // add - appending
                myArrayList.add("hello");
                myArrayList.add(true);
                System.out.println(myArrayList);
                
                ArrayList<String> myStringList = new ArrayList<String>();
                myStringList.add("Hello");
                //myStringList.add(4);
                
                // doing this will not show you string methods:
                //myArrayList.get(1).

                // if you don't specify what type of data
                // my ArrayList has, you have to
                // explicitly cast it to call specific methods

                // get - myList[0]  same as myArrayList.get(0)
                String s = ((String)myArrayList.get(1)).toUpperCase();
                // String ii = ((String)myArrayList.get(0)).toUpperCase();

                System.out.println(s);
                // this can result in errors at runtime

                // GENERICS
                // - allows a data type to be passed in as a parameter
                ArrayList<Integer> intArray = new ArrayList<>();
                intArray.add(5); // same as intArray.add(new Integer(5));
                // not allowed to store primitives; can only store objects
                //ArrayList<int> intArray = new ArrayList<>(); // this is not allowed

                ArrayList<String> strArray = new ArrayList<>();
                strArray.add("hello");

                // not allowed anymore: strArray.add(1);
                // no need for explicit cast
                ((String)strArray.get(0)).toUpperCase();

                // == HashMap == 
                // same as Python dictionaries
                HashMap myMap = new HashMap();

                HashMap<String, Integer> myMap2 = new HashMap<>();

                // put -- adding to the dictionary
                myMap2.put("hello", 207);

                // get -- get values from dictionary
                System.out.println(myMap2.get("hello"));
        }


}



