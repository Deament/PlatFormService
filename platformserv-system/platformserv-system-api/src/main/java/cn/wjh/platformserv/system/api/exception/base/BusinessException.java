package cn.wjh.platformserv.system.api.exception.base;

/**
 * 业务异常.
 *
 * @author michaelfreeman
 */
public class BusinessException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

}