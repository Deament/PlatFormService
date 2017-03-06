package cn.wjh.platformserv.admin.web.security.utils;

import cn.wjh.platformserv.admin.web.security.model.AuthUser;
import cn.wjh.platformserv.common.web.security.AbstractTokenUtil;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/**
 * The type Token util.
 *
 * @author michaelfreeman
 */
@Component
@ConfigurationProperties("security.jwt")
public class TokenUtil extends AbstractTokenUtil {

    @Override
    public UserDetails getUserDetails(String token) {
        String userDetailsString = getUserDetailsString(token);
        if (userDetailsString != null) {
            return new Gson().fromJson(userDetailsString, AuthUser.class);
        }
        return null;
    }

}