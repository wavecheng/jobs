package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.entity.UserRoleEntity;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<UserRoleEntity, Long> {

    UserRoleEntity findByName(String name);

}
