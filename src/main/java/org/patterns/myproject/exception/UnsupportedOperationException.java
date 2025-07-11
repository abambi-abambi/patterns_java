package org.patterns.myproject.exception;

public class UnsupportedOperationException extends AbstractCustomException {
    public UnsupportedOperationException(String msg) {
        super(msg);
    }

    public UnsupportedOperationException(String msg, Object... params) {
        super(msg, params);
    }
}
