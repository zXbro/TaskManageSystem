package org.zxbro.tms.api;

import cn.authing.core.auth.AuthenticationClient;
import cn.authing.core.types.LoginByEmailInput;
import cn.authing.core.types.RegisterByEmailInput;
import cn.authing.core.types.UpdateUserInput;
import cn.authing.core.types.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxbro.tms.api.model.UserLoginInfo;
import org.zxbro.tms.common.Result;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:41 PM
 * Email : zephyrjung@126.com
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private AuthenticationClient authenticationClient;

    @PostMapping("/register")
    public Result userRegister(@RequestBody UserLoginInfo userLoginInfo) {
        RegisterByEmailInput registerByEmailInput = new RegisterByEmailInput(userLoginInfo.getLoginEmail(), userLoginInfo.getLoginPassword());
        authenticationClient.registerByEmail(registerByEmailInput);
        return Result.success();
    }

    @PostMapping("/login")
    public Result userLogin(@RequestBody UserLoginInfo userLoginInfo) {
        try {
            authenticationClient.loginByEmail(new LoginByEmailInput(userLoginInfo.getLoginEmail(), userLoginInfo.getLoginPassword())).execute();
            User user = authenticationClient.updateProfile(new UpdateUserInput().withEmail(userLoginInfo.getLoginEmail())).execute();
            log.info("登录用户：{}", user);
        } catch (Exception e) {
            log.error("login failed", e);
            return Result.failed("1", "1");
        }
        return Result.success();
    }

    @PostMapping("/logout")
    public Result userLogout() {
        return null;
    }
}