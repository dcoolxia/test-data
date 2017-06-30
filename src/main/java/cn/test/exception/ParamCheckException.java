package cn.test.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 参数校验异常
 * @author David
 *
 */
@Getter
@Setter
@ToString
public class ParamCheckException extends NvshenException {
    private static final long serialVersionUID = 4939224980864710252L;
	
	
	/**
	 * 字段名
	 */
	private String fieldName;
	
	/**
	 * 错误信息
	 */
	private String errorInfo;

	/**
	 * 
	 * @param fieldName 字段名
	 * @param errorInfo 错误信息
	 */
	public ParamCheckException(String fieldName, String errorInfo) {
		super(fieldName + " " + errorInfo);
		this.fieldName = fieldName;
		this.errorInfo = errorInfo;
	}
}
