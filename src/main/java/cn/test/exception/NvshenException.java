package cn.test.exception;

/**
 * 自定义异常
 * @author David
 *
 */
public class NvshenException extends Exception {

    private static final long serialVersionUID = 6744806651337798820L;

    public NvshenException() {
        super();
    }
	
    public NvshenException(String message) {
        super(message);
    }

    public NvshenException(String message, Throwable cause) {
        super(message, cause);
    }

    public NvshenException(Throwable cause) {
        super(cause);
    }
}
