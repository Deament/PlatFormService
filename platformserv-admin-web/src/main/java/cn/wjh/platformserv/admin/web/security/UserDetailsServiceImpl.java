package cn.wjh.platformserv.admin.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cn.wjh.platformserv.admin.web.security.model.AuthUserFactory;
import cn.wjh.platformserv.system.api.entity.SysUser;
import cn.wjh.platformserv.system.api.service.ISystemService;

/**
 * Security User Detail Service
 *
 * @author michaelfreeman
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    /**
     * 系统服务
     */
    @Autowired
    private ISystemService systemService;

    @Override
    public UserDetails loadUserByUsername(String loginName) {
        SysUser user = systemService.getUserByLoginName(loginName);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", loginName));
        } else {
            return AuthUserFactory.create(user);
        }
    }
}
