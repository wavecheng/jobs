package com.citrix.apac.recruiting.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_role")
public class UserRoleEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roleEntities")
    private List<Users> userEntities;

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

    public List<Users> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<Users> userEntities) {
        this.userEntities = userEntities;
    }

    @Override
    public String toString() {
        return "UserRoleEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userEntities=" + userEntities +
                '}';
    }

}
