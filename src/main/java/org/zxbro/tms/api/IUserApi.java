package org.zxbro.tms.api;

import org.zxbro.tms.common.Result;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:41 PM
 * Email : zephyrjung@126.com
 **/
public interface IUserApi {
    Result userLogin();

    Result userLogout();
}
