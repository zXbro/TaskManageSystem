package org.zxbro.tms.api.model;

import lombok.Data;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:42 PM
 * Email : zephyrjung@126.com
 **/
@Data
public class Result {
    /**
     * 成功与否
     */
    private Boolean success;
    /**
     * 状态码
     */
    private String code;
    /**
     * 说明信息
     */
    private String message;

    public static Result failed(String code, String message) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }
}
