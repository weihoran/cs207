package whileloop;

/**
 * While loop demo code from lecture slides
 */
public class LoopDemo {

    /**
     * Version using type double
     */
    public static void while_v1() {
        System.out.println("Version 1");
        double i = 0;
        while (i < 0.5) {
            i += 0.1;
            System.out.println(i);
        }
        System.out.println(i == 1);
    }

    /**
     * Version using type float
     */
    public static void while_v2() {
        System.out.println("Version 2");
        float i = 0;
        while (i < 1) {
            i += 0.1;
            System.out.println(i);
        }
        System.out.println(i == 1);
    }

    /**
     * Version using type int
     */
    public static void while_v3() {
        System.out.println("Version 3");
        int j = 0;
        while (j < 10) {
            j += 1;
            System.out.println(j * 0.1);
        }
        System.out.println(j * 0.1 == 1);
    }

    public static void main(String[] args) {

        System.out.println("\nApproach A (using static methods)\n");

        LoopDemo.while_v1();
        LoopDemo.while_v2();
        LoopDemo.while_v3();

        System.out.println("\nApproach B (using inheritance)\n");

        LoopBase[] runs = {new LoopV1(), new LoopV2(), new LoopV3()};
        for (LoopBase r : runs) {
            r.execute();
        }
    }
}
