package by.bsuir.Yaskevich.Exception;

/**
 * ServiceException class.
 * @author Yaskevich Anton
 */
public class ServiceException extends Exception {

    /**
     * ServiceException constructor with parameter
     *
     * @param message - message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * ServiceException constructor with parameter
     *
     * @param e - exception
     */
    public ServiceException(Exception e) {
        super(e);
    }

}
