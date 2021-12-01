package whileloop;

public class LoopV1 extends LoopBase {

    public LoopV1() {
        this.name = "Version 1";
    }

    /**
     * Version using type double
     */
    public void execute() {
        super.execute();
        double i = 0;

        while (i < 1) {
            i += 0.1;
            System.out.println(i);
        }
        System.out.println(i == 1);
    }

}
