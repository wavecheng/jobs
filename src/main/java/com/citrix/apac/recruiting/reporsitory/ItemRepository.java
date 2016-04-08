package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.dao.RssFeedEntity;
import com.citrix.apac.recruiting.dao.RssFeedEntryEntity;

import java.util.List;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<RssFeedEntryEntity, Long> {

    List<RssFeedEntryEntity> findByRssFeedEntity(RssFeedEntity rssFeedEntity, Pageable pageable);

    RssFeedEntryEntity findByRssFeedEntityAndLink(RssFeedEntity rssFeedEntity, String link);

}
