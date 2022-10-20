package org.zxbro.tms.common;

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
}
