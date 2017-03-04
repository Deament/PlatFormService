package cn.wjh.platformserv.common.web.security.model;

import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * Security User
 *
 * @author michaelfreeman
 */
public abstract class AbstractAuthUser implements UserDetails {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

}