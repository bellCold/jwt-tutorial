package com.example.jwttutorial.exception;

public class DuplicateMemberException extends RuntimeException {
    ErrorMessage errorMessage;

    public DuplicateMemberException() {
        super();
    }
    public DuplicateMemberException(String message, Throwable cause) {
        super(message, cause);
    }
    public DuplicateMemberException(String message) {
        super(message);
    }
    public DuplicateMemberException(Throwable cause) {
        super(cause);
    }

    public DuplicateMemberException(ErrorMessage errorMessage) {
        super(errorMessage.message);
        this.errorMessage = errorMessage;
    }
}