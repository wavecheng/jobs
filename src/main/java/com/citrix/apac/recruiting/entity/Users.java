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
    
    @OneToMany(mappedBy = "users", cascade = CascadeType.REMOVE)
    private List<UserEducation> userEducation;

    @ManyToOne
    private University university;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getBirthProvince() {
		return birthProvince;
	}

	public void setBirthProvince(String birthProvince) {
		this.birthProvince = birthProvince;
	}

	public String getBirthCity() {
		return birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public String getCurrentProvince() {
		return currentProvince;
	}

	public void setCurrentProvince(String currentProvince) {
		this.currentProvince = currentProvince;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getCitytoExam() {
		return citytoExam;
	}

	public void setCitytoExam(String citytoExam) {
		this.citytoExam = citytoExam;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public String getSalaryExpect() {
		return salaryExpect;
	}

	public void setSalaryExpect(String salaryExpect) {
		this.salaryExpect = salaryExpect;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public EduLevel getDegree() {
		return degree;
	}

	public void setDegree(EduLevel degree) {
		this.degree = degree;
	}

	public Date getGraduateDate() {
		return graduateDate;
	}

	public void setGraduateDate(Date graduateDate) {
		this.graduateDate = graduateDate;
	}

	public int getCet4Score() {
		return cet4Score;
	}

	public void setCet4Score(int cet4Score) {
		this.cet4Score = cet4Score;
	}

	public int getToefl() {
		return toefl;
	}

	public void setToefl(int toefl) {
		this.toefl = toefl;
	}

	public int getGmat() {
		return gmat;
	}

	public void setGmat(int gmat) {
		this.gmat = gmat;
	}

	public int getGre() {
		return gre;
	}

	public void setGre(int gre) {
		this.gre = gre;
	}

	public int getToeic() {
		return toeic;
	}

	public void setToeic(int toeic) {
		this.toeic = toeic;
	}

	public String getOral() {
		return oral;
	}

	public void setOral(String oral) {
		this.oral = oral;
	}

	public String getSecLanguage() {
		return secLanguage;
	}

	public void setSecLanguage(String secLanguage) {
		this.secLanguage = secLanguage;
	}

	public String getSecondLangLevel() {
		return secondLangLevel;
	}

	public void setSecondLangLevel(String secondLangLevel) {
		this.secondLangLevel = secondLangLevel;
	}

	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Timestamp getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public List<UserEducation> getUserEducation() {
		return userEducation;
	}

	public void setUserEducation(List<UserEducation> userEducation) {
		this.userEducation = userEducation;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}


}
