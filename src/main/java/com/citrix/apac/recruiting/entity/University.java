package com.citrix.apac.recruiting.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "university_name", length = 200,unique=true)
    private String universityName;

    @Column(name="province", length = 100)
    private String province;
    
    @OneToMany(mappedBy = "university")
    private List<Users> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}
   
}
