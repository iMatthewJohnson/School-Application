package ExceptionClasses;

public class NoDataException extends Exception {

    public NoDataException() {
        super();
    }

    public NoDataException(String errorMessage) {
        super(errorMessage);
    }
}

