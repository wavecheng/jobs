package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.entity.Users;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);

}
