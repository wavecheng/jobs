package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.dao.RssFeedEntity;
import com.citrix.apac.recruiting.dao.UserEntity;

import java.util.List;

@Repository("blogRepository")
public interface BlogRepository extends JpaRepository<RssFeedEntity, Long> {

    List<RssFeedEntity> findByUserEntity(UserEntity userEntity);

}
