package ExceptionClasses;

public class InvalidDataException extends Exception {


    public InvalidDataException() {
        super();
    }

    public InvalidDataException(String errorMessage) {
        super(errorMessage);
    }

    public InvalidDataException(String causedBy,InvalidDataType type) {

    }

    public enum InvalidDataType {
        INCORRECT_LENGTH,
        NOT_NUMBER
    }


}
