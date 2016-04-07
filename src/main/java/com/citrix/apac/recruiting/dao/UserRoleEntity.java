package com.citrix.apac.recruiting.dao;

import javax.persistence.*;
import java.util.List;

/**
 * Author: Daniel
 */
@Entity
@Table(name = "user_role")
public class UserRoleEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roleEntities")
    private List<UserEntity> userEntities;

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

    public List<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<UserEntity> userEntities) {
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
