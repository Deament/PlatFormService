package cn.wjh.platformserv.common.web.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Web 工具类
 *
 * @author michaelfreeman
 */
public final class WebUtils {

    /**
     * 文件临时存储路径
     */

    private WebUtils() {
        throw new IllegalAccessError("Utility class");
    }


    /**
     * 获取当前登录者对象
     *
     * @param <T> the type parameter
     * @return the current user
     */
    @SuppressWarnings("unchecked")
    public static <T extends UserDetails> T getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return (T) authentication.getPrincipal();
    }

}
