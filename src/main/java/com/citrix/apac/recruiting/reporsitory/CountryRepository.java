package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.entity.University;

@Repository("countryRepository")
public interface CountryRepository extends JpaRepository<University, Long> {
}
