package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.entity.RssFeedEntity;
import com.citrix.apac.recruiting.entity.Users;

import java.util.List;

@Repository("blogRepository")
public interface BlogRepository extends JpaRepository<RssFeedEntity, Long> {

    List<RssFeedEntity> findByUserEntity(Users userEntity);

}
