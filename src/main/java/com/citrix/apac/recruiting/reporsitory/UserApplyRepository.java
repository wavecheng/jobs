package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.entity.UserApply;

@Repository("userApplyRepository")
public interface UserApplyRepository extends JpaRepository<UserApply, Long> {


}
