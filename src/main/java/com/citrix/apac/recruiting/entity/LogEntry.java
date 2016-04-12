package com.citrix.apac.recruiting.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logs")
public class LogEntry {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "content", length = 300)
    private String content;

    @Column(name="log_type",nullable=false)
    @Enumerated(EnumType.STRING)
    private LogType logType;
    
    @Column(name="worker_id")
    private Long workerId;
    
    @Column(name = "worker_name")
    private String wokerName;

    @Column(name="user_id")
    private Long userId;
    
    @Column(name = "user_name")
    private String userName;

    @Column(name="job_id")
    private Long jobId;
    
    @Column(name = "job_name")
    private String jobName;
    
    @Column(name="log_time")
    private Timestamp logTime = new Timestamp(System.currentTimeMillis());
    
    
    
}
