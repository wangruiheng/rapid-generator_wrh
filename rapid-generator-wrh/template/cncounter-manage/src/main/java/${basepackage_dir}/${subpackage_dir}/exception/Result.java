<#include "/macro.include"/>
<#include "/java_copyright.include">
package ${basepackage}.${subpackage}.exception;

/**
 * @author wangruiheng
 */
public class Result<T> {

    private int code;
    private String msg;
    private T data;
    private long count;

    public Result() {
    }

    public Result(ResultCode resultCode, T data) {
        this(resultCode);
        this.data = data;
    }
    
    public Result(ResultCode resultCode, T data , long count) {
        this(resultCode);
        this.data = data;
        this.count = count;
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
    
}
