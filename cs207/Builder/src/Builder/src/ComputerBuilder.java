package Builder.src;

public class ComputerBuilder extends Builder {
    private Computer mComputer=new Computer();
    @Override
    void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    void buildOs(String os) {
        mComputer.setOs(os);
    }

    @Override
    Computer createComputer() {
        return mComputer;
    }

}












