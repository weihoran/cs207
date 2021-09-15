public class test {

    public static void main(String[] args) {
        Performer performer = new Performer();
        for (int i = 0; i < 5; i++) {
            Audience v = new Audience(i);
            performer.addObserver(v);
        }
        performer.perform();
    }
}
