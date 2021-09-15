package Builder.src;

public abstract class Builder {

    abstract void buildBoard(String board);
    abstract void buildDisplay(String display);
    abstract void buildOs(String display);
    abstract Computer createComputer();

}