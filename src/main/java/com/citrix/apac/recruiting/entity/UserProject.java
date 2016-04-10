package com.citrix.apac.recruiting.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author boch
 */
@Entity
@Table(name = "user_project")
public class UserProject {
	
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="from_date")
    private Date fromDate;
    
    @Column(name="to_date")
    private Date toDate;
    
    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;
    
    @Column(name="duty")
    private String duty;
    
    @Column(name="update_time")
    private Timestamp updateTime = new Timestamp(System.currentTimeMillis());
    
    @ManyToOne
    private User user;


}
