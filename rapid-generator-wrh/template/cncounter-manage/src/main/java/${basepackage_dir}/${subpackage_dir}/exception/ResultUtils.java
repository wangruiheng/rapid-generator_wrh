<#include "/macro.include"/>
<#include "/java_copyright.include">
package ${basepackage}.${subpackage}.exception;

/**
 * @author wangruiheng
 */
public class ResultUtils {

    public static Result<Object> success(Object data) {
        return new Result<>(ResultCode.SUCCESS, data);
    }
    
    public static Result<Object> successlist(Object data,long count) {
        return new Result<>(ResultCode.SUCCESS, data , count);
    }
    
    public static Result<Object> fail(Object data) {
        return new Result<>(ResultCode.FAIL, data);
    }
    
    public static Result<Object> error(Object data) {
        return new Result<>(ResultCode.ERROR, data);
    }

    public static Result<Object> warn(ResultCode resultCode, String msg) {
        Result<Object> result = new Result<>(resultCode);
        result.setMsg(msg);
        return result;
    }

    public static Result<Object> warn(ResultCode resultCode) {
        return new Result<Object>(resultCode);
    }

}
