package org.patterns.myproject.exception;

public abstract class AbstractCustomException extends RuntimeException {
    public AbstractCustomException(String msg) {
        super(msg);
    }

    public AbstractCustomException(String msg, Throwable ex, Object... params) {
        super(String.format(msg, params), ex);
    }

    public AbstractCustomException(String msg, Object... params) {
        super(String.format(msg, params));
    }
}
