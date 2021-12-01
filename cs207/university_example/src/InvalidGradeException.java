public class InvalidGradeException extends Exception {
    
    public InvalidGradeException() {
    }

    public InvalidGradeException(String message) {
        super(message);
    }

    public InvalidGradeException(Throwable cause) {
        super(cause);
    }

    public InvalidGradeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     *  
     * The suppression behavior is enabled unless disabled via 
     * a constructor. Note that when one exception causes another 
     * exception, the first exception is usually caught and then 
     * the second exception is thrown in response. In other words, 
     * there is a causal connection between the two exceptions. 
     * In contrast, there are situations where two independent 
     * exceptions can be thrown in sibling code blocks, in particular 
     * in the try block of a try-with-resources statement and the 
     * compiler-generated finally block which closes the resource. 
     * In these situations, only one of the thrown exceptions can 
     * be propagated. In the try-with-resources statement, 
     * when there are two such exceptions, the exception originating 
     * from the try block is propagated and the exception from the 
     * finally block is added to the list of exceptions suppressed 
     * by the exception from the try block. As an exception unwinds 
     * the stack, it can accumulate multiple suppressed exceptions. 
     * An exception may have suppressed exceptions while also being 
     * caused by another exception. Whether or not an exception has
     * a cause is semantically known at the time of its creation, 
     * unlike whether or not an exception will suppress other 
     * exceptions which is typically only determined after an 
     * exception is thrown. Note that programmer written code is also 
     * able to take advantage of calling this method in situations 
     * where there are multiple sibling exceptions and only one can 
     * be propagated.
     */
    public InvalidGradeException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
