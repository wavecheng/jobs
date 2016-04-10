package com.citrix.apac.recruiting.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.citrix.apac.recruiting.entity.Enums.EduLevel;
import com.citrix.apac.recruiting.entity.Enums.Gender;
import com.citrix.apac.recruiting.entity.Enums.UserType;


@Entity
@Table(name = "users")
public class Users {
	
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

    @Column(name="mobile")
    private String mobile;
    
    @Column(name="name_eng")
    private String nameEng;
    
    @Column(name="gender")
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    
    private boolean married;

    @Column(name="idcard_no")
    private String idCardNo;
    
    @Column(name="birth_province")
    private String birthProvince;

    @Column(name="birth_city")
    private String birthCity;
    
    @Column(name="current_province")
    private String currentProvince;
    
    @Column(name="current_city")
    private String currentCity;
    
    @Column(name="city_to_exam")
    private String citytoExam;
    
    @Column(name="user_type")
    @Enumerated(EnumType.STRING)
    private UserType type;
    
    @Column(name="salary_expect")
    private String salaryExpect;

    @Column(name="depart")
    private String depart;
    
    @Column(name="major")
    private String major;
    
    @Column(name="degree")
    @Enumerated(EnumType.STRING)
    private EduLevel degree;
    
    @Column(name="graduate_date")
    private Date graduateDate;
   
    @Column(name="cet4_score")
    private int cet4Score;

    @Column(name="toefl")
    private int toefl;

    @Column(name="gmat")
    private int gmat;
    
    @Column(name="gre")
    private int gre;
    
    @Column(name="toeic")
    private int toeic;
    
    @Column(name="oral")
    private String oral;

    @Column(name="second_lang")
    private String secLanguage;
    
    @Column(name="second_lang_level")
    private String secondLangLevel;
    
    @Column(name="awards")
    private String awards;

    @Column(name="enabled")
    private boolean enabled;
    
    @Column(name="register_time")
    private Timestamp registerTime = new Timestamp(System.currentTimeMillis());
    
    @OneToMany(mappedBy = "userEducation", cascade = CascadeType.REMOVE)
    private List<UserEducation> userEducation;

    @ManyToOne
    private University university;


}
