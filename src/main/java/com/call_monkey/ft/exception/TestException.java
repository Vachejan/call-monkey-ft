package com.call_monkey.ft.exception;

/**
 * @author by arsen on 11/28/16..
 */
class TestException extends Exception {

    TestException(String message) {
        super(message);
    }

    public TestException(String message, Throwable cause) {
        super(message, cause);
    }
}
