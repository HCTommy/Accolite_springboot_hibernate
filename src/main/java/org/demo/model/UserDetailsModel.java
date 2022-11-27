package org.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetailsModel {
    @Id
    @GeneratedValue
    Integer id;

    @Column(name = "login_id")
    Integer loginId;

    @Column(name = "name")
    String name;

    @Column(name = "contact_number")
    String contactNumber;

    @Column(name = "type")
    String type;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id")
    LoginModel loginModel;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "loginDetailsModel")
    PermissionModel permissionModel;

    public PermissionModel getPermissionModel() {
        return permissionModel;
    }

    public void setPermissionModel(PermissionModel permissionModel) {
        this.permissionModel = permissionModel;
    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LoginDetailsModel{" +
                "id=" + id +
                ", loginId=" + loginId +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
