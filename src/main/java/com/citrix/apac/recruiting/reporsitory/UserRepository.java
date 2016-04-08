package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.dao.UserEntity;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByName(String name);

}
