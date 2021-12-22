package top.diruipu.aaa.common.core.entity;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author diruipu
 * @create 2021-12-21 5:19 PM
 * @ClassName AaaResponse
 */
@Slf4j
public class APIResponse<T> {
    public static final int SUCCESS = 200;
    public static final int FAIL = 500;
    public static final String SUCCESS_MESSAGE = "response_success";
    public static final String FAIL_MESSAGE = "response_fail";
    protected int code;
    protected T data;
    protected String message;

    private APIResponse() {
        this.code = 0;
        this.data = null;
        this.message = null;
    }

    private APIResponse(int code) {
        this(code, null, (String)null);
    }

    private APIResponse(int code, T data) {
        this(code, data, (String)null);
    }

    private APIResponse(int code, T data, String message) {
        this.code = 0;
        this.data = null;
        this.message = null;
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public boolean isSuccess() {
        return SUCCESS == this.getCode();
    }

    public static boolean isSuccess(APIResponse apiResponse) {
        return apiResponse == null ? false : apiResponse.isSuccess();
    }

    public static APIResponse success() {
        return new APIResponse(SUCCESS, (Object)null, SUCCESS_MESSAGE);
    }

    public static <T> APIResponse<T> success(T data) {
        return new APIResponse(SUCCESS, data, SUCCESS_MESSAGE);
    }

    public static <T> APIResponse<T> success(T data, String message) {
        return StringUtils.isEmpty(message) ? new APIResponse(SUCCESS, SUCCESS_MESSAGE) : new APIResponse(SUCCESS, data, message);
    }

    public static APIResponse fail(String message) {
        return StringUtils.isEmpty(message) ? new APIResponse(FAIL, (Object)null, FAIL_MESSAGE) : new APIResponse(FAIL, (Object)null, message);
    }

    public static <T> APIResponse<T> fail(String message, T data) {
        return StringUtils.isEmpty(message) ? new APIResponse(FAIL, data, FAIL_MESSAGE) : new APIResponse(FAIL, data, message);
    }

    public static APIResponse fail(Throwable t) {
        return fail(t.getMessage());
    }

    public static APIResponse response(int code) {
        if (code == 0) {
            code = SUCCESS;
        }

        return new APIResponse(code, (Object)null, SUCCESS_MESSAGE);
    }

    public static <T> APIResponse<T> response(int code, T data) {
        if (code == 0) {
            code = SUCCESS;
        }

        return new APIResponse(code, data, SUCCESS_MESSAGE);
    }

    public static <T> APIResponse<T> response(int code, T data, String message) {
        if (code == 0) {
            code = SUCCESS;
        }

        if (StringUtils.isEmpty(message)) {
            message = SUCCESS_MESSAGE;
        }

        return new APIResponse(code, data, message);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
