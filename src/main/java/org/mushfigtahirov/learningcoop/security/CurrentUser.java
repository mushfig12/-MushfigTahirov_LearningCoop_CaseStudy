package org.mushfigtahirov.learningcoop.security;

import java.util.Collection;
import java.util.Collections;

import org.mushfigtahirov.learningcoop.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
// This class manages username and password of user
public class CurrentUser implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	private User user;
	

	public CurrentUser(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority(user.getUserRole()));
	}

	@Override
	public String getPassword() {
		
	//	return "{noop}" + user.getPassword();
	//	return "{bcrypt}" + user.getPassword();
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		
	//	return "{noop}" + user.getUsername();
	//	return "{bcrypt}" + user.getUsername();
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
