package org.demo.model;


import javax.persistence.*;


@Entity
@Table(name = "login")
public class LoginModel {
    @Id
    @GeneratedValue
    Integer id;
    @Column(name = "password")
    String password;
    @Column(name = "status")
    String status;

    @Override
    public String toString() {
        return "LoginModel{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "loginModel")
//    @OneToOne(cascade = CascadeType.ALL)
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
