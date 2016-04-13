package com.citrix.apac.recruiting.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.citrix.apac.recruiting.entity.Enums.ApplyStatus;

/**
 * @author boch
 */
@Entity
@Table(name = "user_apply")
public class UserApply {
	
    @Id
    @GeneratedValue
    private Long id;
   
    @Column(name="stage", unique=true)
    private String name;

    @Column(name="worker_name")
    private String wokerName;
    
    @Column(name="apply_status",nullable=false)
    @Enumerated(EnumType.STRING)
    private ApplyStatus status = ApplyStatus.Applying;
    
    @Column(name="remark", length=255)
    private String remark;
    
    @Column(name="apply_time")
    private Timestamp applyTime = new Timestamp(System.currentTimeMillis());

    @Column(name="update_time")
    private Timestamp updateTime;
    
    @ManyToOne
    private User user;

}
