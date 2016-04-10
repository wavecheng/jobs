package com.citrix.apac.recruiting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.citrix.apac.recruiting.entity.Users;
import com.citrix.apac.recruiting.reporsitory.UserRepository;

public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userReporsitory;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Users user = userReporsitory.findByName(name);
		
		return user;
	}

}
