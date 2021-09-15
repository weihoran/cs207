public class Director {
    Builder mBuilser=null;


    public Director(Builder builer) {
        this.mBuilser = builer;
    }

    public Computer construct(String board,String display, String os){
        mBuilser.buildDisplay(display);
        mBuilser.buildBoard(board);
        mBuilser.buildOs(os);
        return mBuilser.createComputer();
    }
}
