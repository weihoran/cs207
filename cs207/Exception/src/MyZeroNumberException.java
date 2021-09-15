
//you can extends Exception(checked) or RuntimeException(unchecked)
 public class MyZeroNumberException extends Exception{
    public MyZeroNumberException(String msg)
    {
        super(msg);
    }
}










 class MultipleMyZeroNumberException extends MyZeroNumberException {
     public MultipleMyZeroNumberException(String msg)
     {
         super(msg);
     }
 }