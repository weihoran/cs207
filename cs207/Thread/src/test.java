import java.util.List;

public class test {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1");
            }
        };

        Runnable r2 = () -> {
            System.out.println("thread 2");
        };

        Thread r3 = new Thread() {
            public void run() {
                System.out.println("thread 3");
            }
        };

        Thread r4 = new Thread(() -> System.out.println("thread 4"));

        new Thread(r1).start();
        new Thread(r2).start();
        r3.start();
        r4.start();
    }

}
