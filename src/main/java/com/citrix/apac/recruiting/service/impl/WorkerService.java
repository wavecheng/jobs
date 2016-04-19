package com.citrix.apac.recruiting.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.security.core.userdetails.cache.SpringCacheBasedUserCache;
import org.springframework.stereotype.Service;

import com.citrix.apac.recruiting.entity.User;
import com.citrix.apac.recruiting.entity.Worker;
import com.citrix.apac.recruiting.reporsitory.JobRepository;
import com.citrix.apac.recruiting.reporsitory.UserRepository;
import com.citrix.apac.recruiting.reporsitory.WorkerRepository;
import com.citrix.apac.recruiting.service.IUserService;

@Service
@Transactional
public class WorkerService{

	@Autowired
	private WorkerRepository workerRepository;
	
	@Autowired
	private JobRepository jobRepository;
	
	public Worker findOne(String email) {		
		return workerRepository.findByEmail(email);
	}


	public Worker findByEmail(String email) {

		Worker wk = workerRepository.findByEmail(email);		
		wk.setJobs(jobRepository.findByWorker(wk));

		//Hibernate.initialize(wk.getJobs());
		return wk;
	}


}
