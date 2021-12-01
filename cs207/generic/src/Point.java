import java.util.ArrayList;

public class Point <K, V> {
    K x;
    V y;


    Point(K x, V y){
        this.x = x;
        this.y = y;
    }


    public K getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public static void main(String[] args) {
        Integer x =1;
        String y = "aaa";

        Point<Integer,String> point = new Point(x, y);
        //ArrayList<Integer> list = new ArrayList<>();

        System.out.println(point.getX());
        System.out.println(point.getY());

    }

}
