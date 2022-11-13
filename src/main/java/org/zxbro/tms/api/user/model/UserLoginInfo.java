package org.zxbro.tms.api.user.model;

import lombok.Data;

/**
 * @author : yu.zhang
 * @date : 2022/11/13 17:04
 * Email : zephyrjung@126.com
 **/
@Data
public class UserLoginInfo {
    private String loginEmail;
    private String loginPassword;
}
