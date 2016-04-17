package com.citrix.apac.recruiting.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/*
 * @Author boch
 */
@Entity
@Table(name = "workers")
public class Worker {
	
    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 3, message = "Name must be at least 3 characters!")
    @Column(unique = true)
    private String name;

    @Email(message = "Invalid e-mail address!")
    @Size(min = 3, message = "E-mail must be at least 3 characters!")
    private String email;

    @Size(min = 5, message = "Password must be at least 5 characters!")
    private String password;

    @Column(name="enabled")
    private boolean enabled = true;
    
    @Column(name="register_time")
    private Timestamp registerTime = new Timestamp(System.currentTimeMillis());
    
    @OneToMany(mappedBy = "worker", cascade = CascadeType.REMOVE)
    private List<Job> jobs;
    
    @OneToMany(mappedBy = "worker", cascade = CascadeType.REMOVE)
    private List<UserInterview> userInterview;
}
