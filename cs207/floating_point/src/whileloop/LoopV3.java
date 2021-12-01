package whileloop;

public class LoopV3 extends LoopBase {

    public LoopV3() {
        this.name = "Version 3";
    }

    /**
     * Version using type int
     */
    public void execute() {
        super.execute();
        int j = 0;

        while (j < 10) {
            j += 1;
            System.out.println(j * 0.1);
        }
        System.out.println(j * 0.1 == 1);
    }

}
