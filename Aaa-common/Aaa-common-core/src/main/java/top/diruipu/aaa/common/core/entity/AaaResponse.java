package top.diruipu.aaa.common.core.entity;

import java.util.HashMap;

/**
 * @author diruipu
 * @create 2021-12-21 5:29 PM
 * @ClassName AaaResponse
 */
public class AaaResponse  extends HashMap<String, Object> {

    private static final long serialVersionUID = 338387624625378006L;

    public AaaResponse message(String message) {
        this.put("message", message);
        return this;
    }

    public AaaResponse data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public AaaResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}