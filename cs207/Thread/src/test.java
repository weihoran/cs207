import java.util.List;

public class test {

    public static void main(String[] args){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1");
            }
        };

        Runnable r2 = () -> {System.out.println("thread 2");};

        Thread r3 = new Thread(){
            public void run(){
                System.out.println("thread 3");
            }
        };

        Thread r4 = new Thread(() -> System.out.println("thread 4"));

        new Thread(r1).start();
        new Thread(r2).start();
        r3.start();
        r4.start();


        //two ways to do multi-threading





    //first one, with Runnable Interface, utilize this method in the test.
    class demo implements Runnable {

        public void run(){
            System.out.println("hello");
        }
    }
    Thread t1 = new Thread(demo);
    t1.start();


    //second one, with Thread class
    class demo2 extends Thread{
        public void run(){
            System.out.println("deom3");
        }
    }
    demo2.start();


    }







}
