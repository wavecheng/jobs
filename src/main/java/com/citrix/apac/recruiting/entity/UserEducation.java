package com.citrix.apac.recruiting.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.citrix.apac.recruiting.entity.Enums.EduLevel;

@Entity
@Table(name = "user_edu")
public class UserEducation {
	
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="from_date")
    private Date fromDate;
    
    @Column(name="to_date")
    private Date toDate;
    
    @Column(name="university")
    private String university;

    @Column(name="depart")
    private String depart;
    
    @Column(name="major")
    private String major;
    
    @Column(name="degree")
    @Enumerated(EnumType.STRING)
    private EduLevel degree;
    
    @Column(name="graduate_date")
    private Date graduateDate;
   
    @Column(name="total_rank")
    private int totalRank;
   
    @Column(name="courses")
    private String courses;

    @Column(name="remark")
    private String remark;
    
    @Column(name="update_time")
    private Timestamp updateTime = new Timestamp(System.currentTimeMillis());
    
    @ManyToOne
    private Users users;

 
}
