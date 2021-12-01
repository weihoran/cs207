package whileloop;

public class LoopV2 extends LoopBase {

    public LoopV2() {
        this.name = "Version 2";
    }

    /**
     * Version using type float
     */
    public void execute() {
        super.execute();
        float i = 0;

        while (i < 1) {
            i += 0.1;
            System.out.println(i);
        }
        System.out.println(i == 1);
    }

}
