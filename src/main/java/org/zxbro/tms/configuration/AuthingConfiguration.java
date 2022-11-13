package org.zxbro.tms.configuration;

import cn.authing.core.auth.AuthenticationClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : yu.zhang
 * @date : 2022/11/5 10:48
 * Email : zephyrjung@126.com
 **/
@Configuration
public class AuthingConfiguration {
    private static final String APP_ID = "6247b518b011345c1bee6af9";
    private static final String APP_HOST = "https://zephyrjung.authing.cn";

    private static final String AUTHING_APP_SECRET = "72300740824f6dd29c4c1502a236dab6";

    @Bean
    public AuthenticationClient authenticationClient() {
        AuthenticationClient authentication = new AuthenticationClient(APP_ID, APP_HOST);
        authentication.setSecret(AUTHING_APP_SECRET);
        return authentication;
    }
}
