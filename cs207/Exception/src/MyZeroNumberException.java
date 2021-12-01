
//you can extends Exception(checked) or RuntimeException(unchecked)
 public class MyZeroNumberException extends Exception{
    /*
    public MyZeroNumberException(String msg, int variable)
    {
        super(msg + "caused by" + variable);
        //System.out.println("caused by" + variable);
    }
     */
    public MyZeroNumberException(String msg){
        super(msg);
    }
}



