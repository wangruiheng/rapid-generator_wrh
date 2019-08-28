<#include "/macro.include"/>
package ${basepackage}.${subpackage}.exception;

/**
 * @version 1.0
 * 结果异常 ExceptionHandler捕捉并返回给前端
 * @author wrh
 */
public class ResultException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private ResultCode resultCode;

    public ResultException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
