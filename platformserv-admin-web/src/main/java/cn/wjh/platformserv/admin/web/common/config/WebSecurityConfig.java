package cn.wjh.platformserv.admin.web.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import cn.wjh.platformserv.common.web.config.AbstractWebSecurityConfig;

/**
 * spring-security配置
 *
 * @author michaelfreeman
 */
@Configuration
public class WebSecurityConfig extends AbstractWebSecurityConfig {

    @Override
    protected void configure(HttpSecurity security) throws Exception {
        security
            .authorizeRequests()
            .antMatchers(HttpMethod.POST, "/auth/token").permitAll();
        super.configure(security);
    }
}
