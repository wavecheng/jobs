package com.citrix.apac.recruiting.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citrix.apac.recruiting.entity.Worker;

@Repository("workRepository")
public interface WorkerRepository extends JpaRepository<Worker, Long> {

    Worker findByEmail(String email);

}
