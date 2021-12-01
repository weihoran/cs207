public class JoinExample1 extends Thread
{
    public void run()
    {
        for(int i=1; i<=4; i++)
        {
            try
            {
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
    public static void main(String args[])
    {
        JoinExample1 thread1 = new JoinExample1();
        JoinExample1 thread2 = new JoinExample1();
        JoinExample1 thread3 = new JoinExample1();
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread2.start();
        thread2.suspend();
        thread3.start();
        thread2.resume();
    }
}
