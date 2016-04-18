package com.citrix.apac.recruiting.service;

import java.util.List;

import com.citrix.apac.recruiting.entity.User;

public interface IUserService {
	
    List<User> findAll();

    User findOne(Long id);

    User findOne(String email);

    User findOneWithAllApply(Long id);

    void saveUser(User user);

    void disableUser(Long id);

}
