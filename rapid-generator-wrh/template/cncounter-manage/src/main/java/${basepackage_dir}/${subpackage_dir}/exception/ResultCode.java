<#include "/macro.include"/>
<#include "/java_copyright.include">
package ${basepackage}.${subpackage}.exception;

/**
 * @author wangruiheng
 */
public enum  ResultCode {

    SUCCESS(0, "操作成功"),
    FAIL(-1, "操作失败"),
    ERROR(500, "服务发生错误");
    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
