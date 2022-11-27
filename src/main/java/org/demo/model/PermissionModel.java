package org.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "permission")
public class PermissionModel {
    @Id
    @GeneratedValue
    Integer id;

    @Column(name = "user_id")
    Integer userId;

    @Column(name = "permission_level")
    Integer permissionLevel;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id")
    UserDetailsModel loginDetailsModel;

    public UserDetailsModel getLoginDetailsModel() {
        return loginDetailsModel;
    }

    public void setLoginDetailsModel(UserDetailsModel loginDetailsModel) {
        this.loginDetailsModel = loginDetailsModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    @Override
    public String toString() {
        return "PermissionModel{" +
                "id=" + id +
                ", userId=" + userId +
                ", permissionLevel=" + permissionLevel +
                '}';
    }
}
