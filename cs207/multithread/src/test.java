public class test {

    public static void main(String [] args){

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("t1 running");
            }
        });
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("t2 running");
            }
        };

        t2.start();

        //lambda
        Thread t3 = new Thread(() -> {
            System.out.println("t3 running");
        });
        t3.start();









    }

}
