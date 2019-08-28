<#include "/macro.include"/>
<#include "/java_copyright.include">
package ${basepackage}.${subpackage}.exception;

/**
 * 结果异常 ExceptionHandler捕捉并返回给前端
 * @author wangruiheng
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
