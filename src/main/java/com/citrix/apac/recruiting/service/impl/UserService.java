package com.citrix.apac.recruiting.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrix.apac.recruiting.entity.User;
import com.citrix.apac.recruiting.reporsitory.UserRepository;
import com.citrix.apac.recruiting.service.IUserService;

@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User findOne(String email) {		
		return userRepository.findByEmail(email);
	}

	@Override
	public User findOneWithAllApply(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void disableUser(Long id) {
		// TODO Auto-generated method stub

	}

}
