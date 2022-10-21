package org.zxbro.tms.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxbro.tms.common.Result;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:41 PM
 * Email : zephyrjung@126.com
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public Result userLogin() {
        return null;
    }

    @PostMapping("/logout")
    public Result userLogout() {
        return null;
    }
}
