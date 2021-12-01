public class Generics {


    public static <T> void print(T[] x) {
        for(T b : x) {
            System.out.println(b);
        }
        System.out.println();
    }


    public static void print(Integer[] a){
        for(Integer i : a)
            System.out.println(i);
    }

    public static void print(Character[] a){
        for(Character i : a)
            System.out.println(i);
    }

    public static void print(String[] a){
        for(String i : a)
            System.out.println(i);
    }



    /*
    public static void print(Object[] a){
        for(Object i : a)
            System.out.println(i);
    }
*/


    public static void main(String[] args) {

        Integer[] intArray = {2, 0, 7};
        Character[] charArray = {'c', 's', 'c'};

        print(intArray);
        print(charArray);

    }

}